package net.muddy.propercopper.mixin;

import net.minecraft.block.*;
import net.minecraft.predicate.block.BlockStatePredicate;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Predicate;

@Debug(export = true)
@Mixin(CarvedPumpkinBlock.class)
public abstract class CarvedPumpkinBlockMixin extends HorizontalFacingBlock {
    protected CarvedPumpkinBlockMixin(Settings settings) {
        super(settings);
    }

    @ModifyArg(
            method = "getIronGolemDispenserPattern",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/predicate/block/BlockStatePredicate;forBlock(Lnet/minecraft/block/Block;)Lnet/minecraft/predicate/block/BlockStatePredicate;")
    )
    private Block proper_copper$changeIronGolemDispenserBaseBlock(Block block) {
        return (Blocks.COPPER_BLOCK);
    }

    @ModifyArg(
            method = "getIronGolemPattern",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/predicate/block/BlockStatePredicate;forBlock(Lnet/minecraft/block/Block;)Lnet/minecraft/predicate/block/BlockStatePredicate;")
    )
    private Block proper_copper$changeIronGolemBaseBlock(Block block) {
        return (Blocks.COPPER_BLOCK);
    }
}
