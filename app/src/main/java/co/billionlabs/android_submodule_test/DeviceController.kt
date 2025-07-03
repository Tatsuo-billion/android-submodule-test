package co.billionlabs.android_submodule_test

class DeviceController {

    // Comment to check if project has submodule or not
    private var parameterSize = 7
    private var parameters: DoubleArray = DoubleArray(parameterSize)

    var registeredDeviceSet: Collection<String> =
        setOf(
            "Pixel 4",
            "Pixel 8",
            "SM-A536U1",
            "SM-S921U1",
            "SM-A145M",
            "SM-S931U1",
            "moto g power (2022)",
            "moto g 5G - 2024",
        )
}