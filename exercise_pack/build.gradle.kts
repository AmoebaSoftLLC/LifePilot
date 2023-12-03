plugins {
    id("com.android.asset-pack")
}

assetPack {
    packName.set("exercise_pack")
    dynamicDelivery {
        deliveryType.set("[ install-time | fast-follow | on-demand ]")
    }
}