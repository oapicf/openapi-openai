//
// ModelsAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class ModelsAPI {

    /**
     Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     
     - parameter model: (path) The model to delete 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func deleteModel(model: String, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: DeleteModelResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return deleteModelWithRequestBuilder(model: model).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     - DELETE /models/{model}
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - parameter model: (path) The model to delete 
     - returns: RequestBuilder<DeleteModelResponse> 
     */
    open class func deleteModelWithRequestBuilder(model: String) -> RequestBuilder<DeleteModelResponse> {
        var localVariablePath = "/models/{model}"
        let modelPreEscape = "\(APIHelper.mapValueToPathItem(model))"
        let modelPostEscape = modelPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{model}", with: modelPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<DeleteModelResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "DELETE", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Lists the currently available models, and provides basic information about each one such as the owner and availability.
     
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func listModels(apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: ListModelsResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return listModelsWithRequestBuilder().execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Lists the currently available models, and provides basic information about each one such as the owner and availability.
     - GET /models
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - returns: RequestBuilder<ListModelsResponse> 
     */
    open class func listModelsWithRequestBuilder() -> RequestBuilder<ListModelsResponse> {
        let localVariablePath = "/models"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<ListModelsResponse>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     
     - parameter model: (path) The ID of the model to use for this request 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func retrieveModel(model: String, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: Model?, _ error: Error?) -> Void)) -> RequestTask {
        return retrieveModelWithRequestBuilder(model: model).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     - GET /models/{model}
     - Bearer Token:
       - type: http
       - name: ApiKeyAuth
     - parameter model: (path) The ID of the model to use for this request 
     - returns: RequestBuilder<Model> 
     */
    open class func retrieveModelWithRequestBuilder(model: String) -> RequestBuilder<Model> {
        var localVariablePath = "/models/{model}"
        let modelPreEscape = "\(APIHelper.mapValueToPathItem(model))"
        let modelPostEscape = modelPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{model}", with: modelPostEscape, options: .literal, range: nil)
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Model>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }
}