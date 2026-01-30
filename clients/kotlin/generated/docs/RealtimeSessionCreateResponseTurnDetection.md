
# RealtimeSessionCreateResponseTurnDetection

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | **kotlin.String** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  |  [optional] |
| **threshold** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  |  [optional] |
| **prefixPaddingMs** | **kotlin.Int** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  |  [optional] |
| **silenceDurationMs** | **kotlin.Int** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  |  [optional] |



