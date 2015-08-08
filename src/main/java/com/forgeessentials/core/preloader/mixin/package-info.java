/**
 * This package is home to all FE mixins, as well as ones relevant for the net.minecraftforge.fe package.
 *
 * This file will contain a list of which patches are required for which features, as well as relevant Forge PRs:
 *
 * FE features:
 *
 * MixinBlockPortal_01: Rendering of portal blocks for /portal
 *
 * MixinEntityTracker_01 and EntityTrackerHelper: For /vanish
 *
 * MixinItemInWorldManager_01: Fix a bug relating to mod compatibility and item use permissions
 *
 * net.minecraftforge.fe support:
 *
 * MixinNetHandlerPlayServer_01: For net.minecraftforge.fe SignEditEvent
 *
 * MixinNetHandlerPlayServer_02: Command block support for net.minecraftforge.fe Permissions API
 *
 * MixinCommandHandler_01 and MixinEntityPlayer_01: For net.minecraftforge.fe Permissions API
 *
 * MixinEntity_01: For net.minecraftforge.fe EntityTriggerPressurePlateEvent
 */
package com.forgeessentials.core.preloader.mixin;