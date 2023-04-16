SUMMARY = "Pi Time initramfs"
LICENSE = "MIT"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"
IMAGE_LINGUAS = "en-us"

export IMAGE_BASENAME = "${MLPREFIX}pitime-image-initramfs"
IMAGE_NAME_SUFFIX ?= ""
IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"

inherit core-image
