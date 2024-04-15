//
// ChatCompletionRequestAssistantMessage.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ChatCompletionRequestAssistantMessage: Codable, JSONEncodable, Hashable {

    public enum Role: String, Codable, CaseIterable {
        case assistant = "assistant"
    }
    /** The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  */
    public var content: String?
    /** The role of the messages author, in this case `assistant`. */
    public var role: Role
    /** An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    public var name: String?
    /** The tool calls generated by the model, such as function calls. */
    public var toolCalls: [ChatCompletionMessageToolCall]?
    @available(*, deprecated, message: "This property is deprecated.")
    public var functionCall: ChatCompletionRequestAssistantMessageFunctionCall?

    public init(content: String? = nil, role: Role, name: String? = nil, toolCalls: [ChatCompletionMessageToolCall]? = nil, functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = nil) {
        self.content = content
        self.role = role
        self.name = name
        self.toolCalls = toolCalls
        self.functionCall = functionCall
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case content
        case role
        case name
        case toolCalls = "tool_calls"
        case functionCall = "function_call"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(content, forKey: .content)
        try container.encode(role, forKey: .role)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(toolCalls, forKey: .toolCalls)
        try container.encodeIfPresent(functionCall, forKey: .functionCall)
    }
}
