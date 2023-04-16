SUMMARY = "Image for building a Pi Time Clock"

LICENSE = "MIT"

#IMAGE_FEATURES += " \
#    read-only-rootfs \
#    ssh-server-openssh \
#"

#IMAGE_INSTALL = " \
#    packagegroup-core-boot \
#    packagegroup-base-extended \
#    ${CORE_IMAGE_EXTRA_INSTALL} \
#    python3-core \
#"

inherit core-image
