DESCRIPTION = "U-Boot port for RaspberryPi2"

require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "rpi-mkimage-native"

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

SRCREV = "33711bdd4a4dce942fb5ae85a68899a8357bdd94"
PV = "v2015.07+git${SRCPV}"

UBOOT_MACHINE = "rpi_2_defconfig"
UBOOT_MAKE_TARGET = "u-boot.bin"
UBOOT_SUFFIX = "bin"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "raspberrypi2"
