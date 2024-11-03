//
// AudioAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class AudioAPI {

    /**
     Generates audio from the input text.
     
     - parameter createSpeechRequest: (body)  
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func createSpeech(createSpeechRequest: CreateSpeechRequest, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: URL?, _ error: Error?) -> Void)) -> RequestTask {
        return createSpeechWithRequestBuilder(createSpeechRequest: createSpeechRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Generates audio from the input text.
     - POST /audio/speech
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - responseHeaders: [Transfer-Encoding(String)]
     - parameter createSpeechRequest: (body)  
     - returns: RequestBuilder<URL> 
     */
    open class func createSpeechWithRequestBuilder(createSpeechRequest: CreateSpeechRequest) -> RequestBuilder<URL> {
        let localVariablePath = "/audio/speech"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: createSpeechRequest)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "application/json",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<URL>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     * enum for parameter responseFormat
     */
    public enum ResponseFormat_createTranscription: String, CaseIterable {
        case json = "json"
        case text = "text"
        case srt = "srt"
        case verboseJson = "verbose_json"
        case vtt = "vtt"
    }

    /**
     * enum for parameter timestampGranularities
     */
    public enum TimestampGranularities_createTranscription: String, CaseIterable {
        case word = "word"
        case segment = "segment"
    }

    /**
     Transcribes audio into the input language.
     
     - parameter file: (form) The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
     - parameter model: (form)  
     - parameter language: (form) The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     - parameter responseFormat: (form) The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to .json)
     - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     - parameter timestampGranularities: (form) The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func createTranscription(file: URL, model: CreateTranscriptionRequestModel, language: String? = nil, prompt: String? = nil, responseFormat: ResponseFormat_createTranscription? = nil, temperature: Double? = nil, timestampGranularities: [TimestampGranularities_createTranscription]? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: CreateTranscription200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return createTranscriptionWithRequestBuilder(file: file, model: model, language: language, prompt: prompt, responseFormat: responseFormat, temperature: temperature, timestampGranularities: timestampGranularities).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Transcribes audio into the input language.
     - POST /audio/transcriptions
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - parameter file: (form) The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
     - parameter model: (form)  
     - parameter language: (form) The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     - parameter responseFormat: (form) The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to .json)
     - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     - parameter timestampGranularities: (form) The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     - returns: RequestBuilder<CreateTranscription200Response> 
     */
    open class func createTranscriptionWithRequestBuilder(file: URL, model: CreateTranscriptionRequestModel, language: String? = nil, prompt: String? = nil, responseFormat: ResponseFormat_createTranscription? = nil, temperature: Double? = nil, timestampGranularities: [TimestampGranularities_createTranscription]? = nil) -> RequestBuilder<CreateTranscription200Response> {
        let localVariablePath = "/audio/transcriptions"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableFormParams: [String: Any?] = [
            "file": file.encodeToJSON(),
            "model": model.encodeToJSON(),
            "language": language?.encodeToJSON(),
            "prompt": prompt?.encodeToJSON(),
            "response_format": responseFormat?.encodeToJSON(),
            "temperature": temperature?.encodeToJSON(),
            "timestamp_granularities[]": timestampGranularities?.encodeToJSON(),
        ]

        let localVariableNonNullParameters = APIHelper.rejectNil(localVariableFormParams)
        let localVariableParameters = APIHelper.convertBoolToString(localVariableNonNullParameters)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "multipart/form-data",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<CreateTranscription200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Translates audio into English.
     
     - parameter file: (form) The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
     - parameter model: (form)  
     - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     - parameter responseFormat: (form) The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to "json")
     - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func createTranslation(file: URL, model: CreateTranscriptionRequestModel, prompt: String? = nil, responseFormat: String? = nil, temperature: Double? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: CreateTranslation200Response?, _ error: Error?) -> Void)) -> RequestTask {
        return createTranslationWithRequestBuilder(file: file, model: model, prompt: prompt, responseFormat: responseFormat, temperature: temperature).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Translates audio into English.
     - POST /audio/translations
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - parameter file: (form) The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  
     - parameter model: (form)  
     - parameter prompt: (form) An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     - parameter responseFormat: (form) The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to "json")
     - parameter temperature: (form) The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     - returns: RequestBuilder<CreateTranslation200Response> 
     */
    open class func createTranslationWithRequestBuilder(file: URL, model: CreateTranscriptionRequestModel, prompt: String? = nil, responseFormat: String? = nil, temperature: Double? = nil) -> RequestBuilder<CreateTranslation200Response> {
        let localVariablePath = "/audio/translations"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableFormParams: [String: Any?] = [
            "file": file.encodeToJSON(),
            "model": model.encodeToJSON(),
            "prompt": prompt?.encodeToJSON(),
            "response_format": responseFormat?.encodeToJSON(),
            "temperature": temperature?.encodeToJSON(),
        ]

        let localVariableNonNullParameters = APIHelper.rejectNil(localVariableFormParams)
        let localVariableParameters = APIHelper.convertBoolToString(localVariableNonNullParameters)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            "Content-Type": "multipart/form-data",
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<CreateTranslation200Response>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}
