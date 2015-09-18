DESCRIPTION = "U-Boot port for RaspberryPi2"

require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "rpi-mkimage-native"

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

SRCREV = "efde6a579fe3c172d214fb3047b02c827779738a"
PV = "v2015.10-rc3+git${SRCPV}"

SRC_URI += "file://0001-dcache_enable.patch"


UBOOT_MACHINE = "rpi_2_defconfig"
UBOOT_MAKE_TARGET = "u-boot.bin"
UBOOT_SUFFIX = "bin"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "raspberrypi2"
