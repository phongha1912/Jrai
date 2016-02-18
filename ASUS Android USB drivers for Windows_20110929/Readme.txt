ASUS Android USB drivers for Windows

VID: 0B05

PID for fastboot: 4DAF

TF101:
PID for MTP: 4E0F
PID for MTP + ADB: 4E1F
PID for RNDIS: 4E2F
PID for RNDIS + ADB: 4E3F

SL101:
PID for MTP: 4E00
PID for MTP + ADB: 4E01
PID for RNDIS: 4E02
PID for RNDIS + ADB: 4E03

TF201:
PID for MTP: 4D00
PID for MTP + ADB: 4D01
PID for RNDIS: 4D02
PID for RNDIS + ADB: 4D03

DaiHuKu:
PID for MTP: 4DDF
PID for MTP + ADB: 4DEF
PID for RNDIS: 4DDD
PID for RNDIS + ADB: 4DDE

Release note

================================================================================
2011/09/29

1. Add the category file for the ADB driver. Now the ADB driver is certified.
2. Add the category file for the MTP driver. Now the MTP driver is certified.
3. Add the category file for the RNDIS driver. Now the RNDIS driver is certified.
================================================================================
2011/09/25

1. Change A60 to TF201 and add the support of MTP for TF201.
2. Add the support of MTP, ADB, and RNDIS support for DaiHuKu.
3. Modify "DriverVer" to "09/25/2011,4.0.0000.1" for ADB.
4. Modify "DriverVer" to "09/25/2011,1.0.0.1" for MTP.
5. Modify "DriverVer" to "09/25/2011,1.0.0.1" for RNDIS.
================================================================================
2011/03/21

Add the category file for the tethering driver. Now the tethering driver is
certified.
================================================================================
2011/03/14

Add the category file for the MTP driver. Now the MTP driver is certified.
================================================================================
2011/03/10

Add the category files for the ADB driver. Now the ADB driver is certified.
================================================================================
2011/03/09-2

Fix the problem for the undefined token "RndisDevice" for the
Ethernet/RNDIS drivers.
================================================================================
2011/03/09-1

Fix the problem that the Ethernet/RNDIS drivers can not work with x64 OS.
================================================================================
2011/03/09

Modify the driver version of MTP to 1.0.0.0.
================================================================================
2011/03/02

Fix the bug that the MTP driver can not be installed in x64.
================================================================================
2011/02/27

1. Add the driver for Ethernet/RNDIS.
2. Correct the provider name to ASUSTeK COMPUTER INC for the MTP driver.
================================================================================
2011/02/26

Add the driver for MTP.
================================================================================
2011/02/24

Correct the provider name to ASUSTeK COMPUTER INC. for the ADB driver.
================================================================================
2011/02/23-1

Correct the ADB interface number for Ethernet.
================================================================================
2011/02/23

1. Rename EP101 to TF101.
2. Add ADB support for SL101.
3. Change MSC for TF101 to MTP.
================================================================================
2011/01/24

1. Support ASUS A60 MSC + ADB.
2. Update the Android USB drivers for Windows to Revesion 4 (December 2010).
3. Remove NVIDIA USB Boot-recovery driver for Mobile devices.
================================================================================
2010/12/14

Add ASUS Android Bootloader Interface for fastboot.
================================================================================
2010/12/09

Add NVIDIA USB Boot-recovery driver for Mobile devices.
================================================================================
2010/10/15

1. Create this to support ASUS EP101 MSC + ADB.
2. The current drivers are not certified.
================================================================================