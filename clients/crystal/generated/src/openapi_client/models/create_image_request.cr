# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class CreateImageRequest
    include JSON::Serializable

    # Required properties
    # A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
    @[JSON::Field(key: "prompt", type: String, nillable: false, emit_null: false)]
    property prompt : String

    # Optional properties
    @[JSON::Field(key: "model", type: CreateImageRequestModel?, nillable: true, emit_null: false)]
    property model : CreateImageRequestModel?

    # The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
    @[JSON::Field(key: "n", type: Int32?, default: 1, nillable: true, emit_null: false)]
    property n : Int32?

    # The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    @[JSON::Field(key: "quality", type: String?, default: "standard", nillable: true, emit_null: false)]
    property quality : String?

    # The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    @[JSON::Field(key: "response_format", type: String?, default: "url", nillable: true, emit_null: false)]
    property response_format : String?

    # The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    @[JSON::Field(key: "size", type: String?, default: "1024x1024", nillable: true, emit_null: false)]
    property size : String?

    # The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    @[JSON::Field(key: "style", type: String?, default: "vivid", nillable: true, emit_null: false)]
    property style : String?

    # A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    @[JSON::Field(key: "user", type: String?, nillable: true, emit_null: false)]
    property user : String?

    class EnumAttributeValidator
      getter datatype : String
      getter allowable_values : Array(String)

      def initialize(datatype, allowable_values)
        @datatype = datatype
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.includes?(value)
      end
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@prompt : String, @model : CreateImageRequestModel?, @n : Int32?, @quality : String?, @response_format : String?, @size : String?, @style : String?, @user : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if !@n.nil? && @n > 10
        invalid_properties.push("invalid value for \"n\", must be smaller than or equal to 10.")
      end

      if !@n.nil? && @n < 1
        invalid_properties.push("invalid value for \"n\", must be greater than or equal to 1.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@n.nil? && @n > 10
      return false if !@n.nil? && @n < 1
      quality_validator = EnumAttributeValidator.new("String", ["standard", "hd"])
      return false unless quality_validator.valid?(@quality)
      response_format_validator = EnumAttributeValidator.new("String", ["url", "b64_json"])
      return false unless response_format_validator.valid?(@response_format)
      size_validator = EnumAttributeValidator.new("String", ["256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"])
      return false unless size_validator.valid?(@size)
      style_validator = EnumAttributeValidator.new("String", ["vivid", "natural"])
      return false unless style_validator.valid?(@style)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] n Value to be assigned
    def n=(n)
      if !n.nil? && n > 10
        raise ArgumentError.new("invalid value for \"n\", must be smaller than or equal to 10.")
      end

      if !n.nil? && n < 1
        raise ArgumentError.new("invalid value for \"n\", must be greater than or equal to 1.")
      end

      @n = n
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] quality Object to be assigned
    def quality=(quality)
      validator = EnumAttributeValidator.new("String", ["standard", "hd"])
      unless validator.valid?(quality)
        raise ArgumentError.new("invalid value for \"quality\", must be one of #{validator.allowable_values}.")
      end
      @quality = quality
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] response_format Object to be assigned
    def response_format=(response_format)
      validator = EnumAttributeValidator.new("String", ["url", "b64_json"])
      unless validator.valid?(response_format)
        raise ArgumentError.new("invalid value for \"response_format\", must be one of #{validator.allowable_values}.")
      end
      @response_format = response_format
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] size Object to be assigned
    def size=(size)
      validator = EnumAttributeValidator.new("String", ["256x256", "512x512", "1024x1024", "1792x1024", "1024x1792"])
      unless validator.valid?(size)
        raise ArgumentError.new("invalid value for \"size\", must be one of #{validator.allowable_values}.")
      end
      @size = size
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] style Object to be assigned
    def style=(style)
      validator = EnumAttributeValidator.new("String", ["vivid", "natural"])
      unless validator.valid?(style)
        raise ArgumentError.new("invalid value for \"style\", must be one of #{validator.allowable_values}.")
      end
      @style = style
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          prompt == o.prompt &&
          model == o.model &&
          n == o.n &&
          quality == o.quality &&
          response_format == o.response_format &&
          size == o.size &&
          style == o.style &&
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
      [prompt, model, n, quality, response_format, size, style, user].hash
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
