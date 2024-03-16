//
// CreateEditRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateEditRequest: Codable, JSONEncodable, Hashable {

    static let nRule = NumericRule<Int>(minimum: 1, exclusiveMinimum: false, maximum: 20, exclusiveMaximum: false, multipleOf: nil)
    static let temperatureRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: false, maximum: 2, exclusiveMaximum: false, multipleOf: nil)
    static let topPRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: false, maximum: 1, exclusiveMaximum: false, multipleOf: nil)
    public var model: CreateEditRequestModel
    /** The input text to use as a starting point for the edit. */
    public var input: String? = ""
    /** The instruction that tells the model how to edit the prompt. */
    public var instruction: String
    /** How many edits to generate for the input and instruction. */
    public var n: Int? = 1
    /** What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    public var temperature: Double? = 1
    /** An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    public var topP: Double? = 1

    public init(model: CreateEditRequestModel, input: String? = "", instruction: String, n: Int? = 1, temperature: Double? = 1, topP: Double? = 1) {
        self.model = model
        self.input = input
        self.instruction = instruction
        self.n = n
        self.temperature = temperature
        self.topP = topP
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case model
        case input
        case instruction
        case n
        case temperature
        case topP = "top_p"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(model, forKey: .model)
        try container.encodeIfPresent(input, forKey: .input)
        try container.encode(instruction, forKey: .instruction)
        try container.encodeIfPresent(n, forKey: .n)
        try container.encodeIfPresent(temperature, forKey: .temperature)
        try container.encodeIfPresent(topP, forKey: .topP)
    }
}

