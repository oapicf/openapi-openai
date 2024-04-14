# #OpenAI API
#
##APIs for sampling from and fine-tuning language models
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class CreateChatCompletionRequest
    include JSON::Serializable

    # Required properties
    @[JSON::Field(key: "model", type: CreateChatCompletionRequestModel, nillable: false, emit_null: false)]
    property model : CreateChatCompletionRequestModel

    # A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
    @[JSON::Field(key: "messages", type: Array(ChatCompletionRequestMessage), nillable: false, emit_null: false)]
    property messages : Array(ChatCompletionRequestMessage)

    # Optional properties
    # A list of functions the model may generate JSON inputs for.
    @[JSON::Field(key: "functions", type: Array(ChatCompletionFunctions)?, nillable: true, emit_null: false)]
    property functions : Array(ChatCompletionFunctions)?

    @[JSON::Field(key: "function_call", type: CreateChatCompletionRequestFunctionCall?, nillable: true, emit_null: false)]
    property function_call : CreateChatCompletionRequestFunctionCall?

    # What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    @[JSON::Field(key: "temperature", type: Float64?, default: 1, nillable: true, emit_null: false)]
    property temperature : Float64?

    # An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    @[JSON::Field(key: "top_p", type: Float64?, default: 1, nillable: true, emit_null: false)]
    property top_p : Float64?

    # How many chat completion choices to generate for each input message.
    @[JSON::Field(key: "n", type: Int32?, default: 1, nillable: true, emit_null: false)]
    property n : Int32?

    # If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
    @[JSON::Field(key: "stream", type: Bool?, default: false, nillable: true, emit_null: false)]
    property stream : Bool?

    @[JSON::Field(key: "stop", type: CreateChatCompletionRequestStop?, nillable: true, emit_null: false)]
    property stop : CreateChatCompletionRequestStop?

    # The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
    @[JSON::Field(key: "max_tokens", type: Int32?, nillable: true, emit_null: false)]
    property max_tokens : Int32?

    # Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    @[JSON::Field(key: "presence_penalty", type: Float64?, default: 0, nillable: true, emit_null: false)]
    property presence_penalty : Float64?

    # Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    @[JSON::Field(key: "frequency_penalty", type: Float64?, default: 0, nillable: true, emit_null: false)]
    property frequency_penalty : Float64?

    # Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
    @[JSON::Field(key: "logit_bias", type: Object?, nillable: true, emit_null: false)]
    property logit_bias : Object?

    # A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    @[JSON::Field(key: "user", type: String?, nillable: true, emit_null: false)]
    property user : String?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@model : CreateChatCompletionRequestModel, @messages : Array(ChatCompletionRequestMessage), @functions : Array(ChatCompletionFunctions)?, @function_call : CreateChatCompletionRequestFunctionCall?, @temperature : Float64?, @top_p : Float64?, @n : Int32?, @stream : Bool?, @stop : CreateChatCompletionRequestStop?, @max_tokens : Int32?, @presence_penalty : Float64?, @frequency_penalty : Float64?, @logit_bias : Object?, @user : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if @messages.size < 1
        invalid_properties.push("invalid value for \"messages\", number of items must be greater than or equal to 1."
      end

      if !@functions.nil? && @functions.size < 1
        invalid_properties.push("invalid value for \"functions\", number of items must be greater than or equal to 1."
      end

      if !@temperature.nil? && @temperature > 2
        invalid_properties.push("invalid value for \"temperature\", must be smaller than or equal to 2.")
      end

      if !@temperature.nil? && @temperature < 0
        invalid_properties.push("invalid value for \"temperature\", must be greater than or equal to 0.")
      end

      if !@top_p.nil? && @top_p > 1
        invalid_properties.push("invalid value for \"top_p\", must be smaller than or equal to 1.")
      end

      if !@top_p.nil? && @top_p < 0
        invalid_properties.push("invalid value for \"top_p\", must be greater than or equal to 0.")
      end

      if !@n.nil? && @n > 128
        invalid_properties.push("invalid value for \"n\", must be smaller than or equal to 128.")
      end

      if !@n.nil? && @n < 1
        invalid_properties.push("invalid value for \"n\", must be greater than or equal to 1.")
      end

      if !@presence_penalty.nil? && @presence_penalty > 2
        invalid_properties.push("invalid value for \"presence_penalty\", must be smaller than or equal to 2.")
      end

      if !@presence_penalty.nil? && @presence_penalty < -2
        invalid_properties.push("invalid value for \"presence_penalty\", must be greater than or equal to -2.")
      end

      if !@frequency_penalty.nil? && @frequency_penalty > 2
        invalid_properties.push("invalid value for \"frequency_penalty\", must be smaller than or equal to 2.")
      end

      if !@frequency_penalty.nil? && @frequency_penalty < -2
        invalid_properties.push("invalid value for \"frequency_penalty\", must be greater than or equal to -2.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @messages.size < 1
      return false if !@functions.nil? && @functions.size < 1
      return false if !@temperature.nil? && @temperature > 2
      return false if !@temperature.nil? && @temperature < 0
      return false if !@top_p.nil? && @top_p > 1
      return false if !@top_p.nil? && @top_p < 0
      return false if !@n.nil? && @n > 128
      return false if !@n.nil? && @n < 1
      return false if !@presence_penalty.nil? && @presence_penalty > 2
      return false if !@presence_penalty.nil? && @presence_penalty < -2
      return false if !@frequency_penalty.nil? && @frequency_penalty > 2
      return false if !@frequency_penalty.nil? && @frequency_penalty < -2
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] messages Value to be assigned
    def messages=(messages)
      if messages.size < 1
        raise ArgumentError.new("invalid value for \"messages\", number of items must be greater than or equal to 1.")
      end

      @messages = messages
    end

    # Custom attribute writer method with validation
    # @param [Object] functions Value to be assigned
    def functions=(functions)
      if !functions.nil? && functions.size < 1
        raise ArgumentError.new("invalid value for \"functions\", number of items must be greater than or equal to 1.")
      end

      @functions = functions
    end

    # Custom attribute writer method with validation
    # @param [Object] temperature Value to be assigned
    def temperature=(temperature)
      if !temperature.nil? && temperature > 2
        raise ArgumentError.new("invalid value for \"temperature\", must be smaller than or equal to 2.")
      end

      if !temperature.nil? && temperature < 0
        raise ArgumentError.new("invalid value for \"temperature\", must be greater than or equal to 0.")
      end

      @temperature = temperature
    end

    # Custom attribute writer method with validation
    # @param [Object] top_p Value to be assigned
    def top_p=(top_p)
      if !top_p.nil? && top_p > 1
        raise ArgumentError.new("invalid value for \"top_p\", must be smaller than or equal to 1.")
      end

      if !top_p.nil? && top_p < 0
        raise ArgumentError.new("invalid value for \"top_p\", must be greater than or equal to 0.")
      end

      @top_p = top_p
    end

    # Custom attribute writer method with validation
    # @param [Object] n Value to be assigned
    def n=(n)
      if !n.nil? && n > 128
        raise ArgumentError.new("invalid value for \"n\", must be smaller than or equal to 128.")
      end

      if !n.nil? && n < 1
        raise ArgumentError.new("invalid value for \"n\", must be greater than or equal to 1.")
      end

      @n = n
    end

    # Custom attribute writer method with validation
    # @param [Object] presence_penalty Value to be assigned
    def presence_penalty=(presence_penalty)
      if !presence_penalty.nil? && presence_penalty > 2
        raise ArgumentError.new("invalid value for \"presence_penalty\", must be smaller than or equal to 2.")
      end

      if !presence_penalty.nil? && presence_penalty < -2
        raise ArgumentError.new("invalid value for \"presence_penalty\", must be greater than or equal to -2.")
      end

      @presence_penalty = presence_penalty
    end

    # Custom attribute writer method with validation
    # @param [Object] frequency_penalty Value to be assigned
    def frequency_penalty=(frequency_penalty)
      if !frequency_penalty.nil? && frequency_penalty > 2
        raise ArgumentError.new("invalid value for \"frequency_penalty\", must be smaller than or equal to 2.")
      end

      if !frequency_penalty.nil? && frequency_penalty < -2
        raise ArgumentError.new("invalid value for \"frequency_penalty\", must be greater than or equal to -2.")
      end

      @frequency_penalty = frequency_penalty
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          model == o.model &&
          messages == o.messages &&
          functions == o.functions &&
          function_call == o.function_call &&
          temperature == o.temperature &&
          top_p == o.top_p &&
          n == o.n &&
          stream == o.stream &&
          stop == o.stop &&
          max_tokens == o.max_tokens &&
          presence_penalty == o.presence_penalty &&
          frequency_penalty == o.frequency_penalty &&
          logit_bias == o.logit_bias &&
          user == o.user
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [model, messages, functions, function_call, temperature, top_p, n, stream, stop, max_tokens, presence_penalty, frequency_penalty, logit_bias, user].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end