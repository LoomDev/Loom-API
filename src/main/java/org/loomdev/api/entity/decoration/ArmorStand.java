package org.loomdev.api.entity.decoration;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.LivingEntity;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.math.EulerAngle;
import org.loomdev.api.util.Hand;

import java.util.Optional;

public interface ArmorStand extends LivingEntity {

    EulerAngle DEFAULT_HEAD_ROTATION = EulerAngle.of(0.0F, 0.0F, 0.0F);
    EulerAngle DEFAULT_BODY_ROTATION = EulerAngle.of(0.0F, 0.0F, 0.0F);
    EulerAngle DEFAULT_LEFT_ARM_ROTATION = EulerAngle.of(-10.0F, 0.0F, -10.0F);
    EulerAngle DEFAULT_RIGHT_ARM_ROTATION = EulerAngle.of(-15.0F, 0.0F, 10.0F);
    EulerAngle DEFAULT_LEFT_LEG_ROTATION = EulerAngle.of(-1.0F, 0.0F, -1.0F);
    EulerAngle DEFAULT_RIGHT_LEG_ROTATION = EulerAngle.of(1.0F, 0.0F, 1.0F);

    @NonNull Optional<ItemStack> getItemInHand(@NonNull Hand hand);

    void setItemInHand(@NonNull Hand hand, @NonNull ItemStack itemStack);

    @NonNull Optional<ItemStack> getBoots();

    void setBoots(@NonNull ItemStack itemStack);

    @NonNull Optional<ItemStack> getLeggings();

    void setLeggings(@NonNull ItemStack itemStack);

    @NonNull Optional<ItemStack> getChestplate();

    void setChestplate(@NonNull ItemStack itemStack);

    @NonNull Optional<ItemStack> getHelmet();

    void  setHelmet(@NonNull ItemStack itemStack);

    @NonNull EulerAngle getBodyPose();

    void setBodyPose(@NonNull EulerAngle eulerAngle);

    @NonNull EulerAngle getLeftArmPose();

    void setLeftArmPose(@NonNull EulerAngle eulerAngle);

    @NonNull EulerAngle getRightArmPose();

    void setRightArmPose(@NonNull EulerAngle eulerAngle);

    @NonNull EulerAngle getLeftLegPose();

    void setLeftLegPose(@NonNull EulerAngle eulerAngle);

    @NonNull EulerAngle getRightLegPose();

    void setRightLegPose(@NonNull EulerAngle eulerAngle);

    @NonNull EulerAngle getHeadPose();

    void setHeadPose(@NonNull EulerAngle eulerAngle);

    boolean isBasePlateHidden();

    void setBasePlateHidden(boolean flag);

    boolean isMarker();

    void setMarker(boolean flag);

    boolean isSmall();

    void setSmall(boolean flag);

    boolean areArmsVisible();

    void setArmsVisible(boolean flag);

}

