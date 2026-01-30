# RealtimeSessionCreateResponseTurnDetection
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] 
**Threshold** | **Decimal** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] 
**PrefixPaddingMs** | **Int32** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] 
**SilenceDurationMs** | **Int32** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeSessionCreateResponseTurnDetection = Initialize-PSOpenAPIToolsRealtimeSessionCreateResponseTurnDetection  -Type null `
 -Threshold null `
 -PrefixPaddingMs null `
 -SilenceDurationMs null
```

- Convert the resource to JSON
```powershell
$RealtimeSessionCreateResponseTurnDetection | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

