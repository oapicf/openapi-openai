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
  # A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
  class MessageContentTextAnnotationsFilePathObject
    include JSON::Serializable

    # Required properties
    # Always `file_path`.
    @[JSON::Field(key: "type", type: String, nillable: false, emit_null: false)]
    property _type : String

    # The text in the message content that needs to be replaced.
    @[JSON::Field(key: "text", type: String, nillable: false, emit_null: false)]
    property text : String

    @[JSON::Field(key: "file_path", type: MessageContentTextAnnotationsFilePathObjectFilePath, nillable: false, emit_null: false)]
    property file_path : MessageContentTextAnnotationsFilePathObjectFilePath

    @[JSON::Field(key: "start_index", type: Int32, nillable: false, emit_null: false)]
    property start_index : Int32

    @[JSON::Field(key: "end_index", type: Int32, nillable: false, emit_null: false)]
    property end_index : Int32

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
    def initialize(@_type : String, @text : String, @file_path : MessageContentTextAnnotationsFilePathObjectFilePath, @start_index : Int32, @end_index : Int32)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if @start_index < 0
        invalid_properties.push("invalid value for \"start_index\", must be greater than or equal to 0.")
      end

      if @end_index < 0
        invalid_properties.push("invalid value for \"end_index\", must be greater than or equal to 0.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      _type_validator = EnumAttributeValidator.new("String", ["file_path"])
      return false unless _type_validator.valid?(@_type)
      return false if @start_index < 0
      return false if @end_index < 0
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] _type Object to be assigned
    def _type=(_type)
      validator = EnumAttributeValidator.new("String", ["file_path"])
      unless validator.valid?(_type)
        raise ArgumentError.new("invalid value for \"_type\", must be one of #{validator.allowable_values}.")
      end
      @_type = _type
    end

    # Custom attribute writer method with validation
    # @param [Object] start_index Value to be assigned
    def start_index=(start_index)
      if start_index < 0
        raise ArgumentError.new("invalid value for \"start_index\", must be greater than or equal to 0.")
      end

      @start_index = start_index
    end

    # Custom attribute writer method with validation
    # @param [Object] end_index Value to be assigned
    def end_index=(end_index)
      if end_index < 0
        raise ArgumentError.new("invalid value for \"end_index\", must be greater than or equal to 0.")
      end

      @end_index = end_index
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          _type == o._type &&
          text == o.text &&
          file_path == o.file_path &&
          start_index == o.start_index &&
          end_index == o.end_index
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [_type, text, file_path, start_index, end_index].hash
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
