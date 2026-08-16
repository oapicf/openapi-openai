//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssistantRequest {
  /// Returns a new [CreateAssistantRequest] instance.
  CreateAssistantRequest({
    required this.model,
    this.name,
    this.description,
    this.instructions,
    this.tools = const [],
    this.toolResources,
    this.metadata,
    this.temperature = 1,
    this.topP = 1,
    this.responseFormat,
  });

  CreateAssistantRequestModel model;

  /// The name of the assistant. The maximum length is 256 characters. 
  String? name;

  /// The description of the assistant. The maximum length is 512 characters. 
  String? description;

  /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  String? instructions;

  /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  List<AssistantObjectToolsInner> tools;

  CreateAssistantRequestToolResources? toolResources;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  Object? metadata;

  /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  ///
  /// Minimum value: 0
  /// Maximum value: 2
  num? temperature;

  /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  ///
  /// Minimum value: 0
  /// Maximum value: 1
  num? topP;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssistantsApiResponseFormatOption? responseFormat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssistantRequest &&
    other.model == model &&
    other.name == name &&
    other.description == description &&
    other.instructions == instructions &&
    _deepEquality.equals(other.tools, tools) &&
    other.toolResources == toolResources &&
    other.metadata == metadata &&
    other.temperature == temperature &&
    other.topP == topP &&
    other.responseFormat == responseFormat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (model.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (instructions == null ? 0 : instructions!.hashCode) +
    (tools.hashCode) +
    (toolResources == null ? 0 : toolResources!.hashCode) +
    (metadata == null ? 0 : metadata!.hashCode) +
    (temperature == null ? 0 : temperature!.hashCode) +
    (topP == null ? 0 : topP!.hashCode) +
    (responseFormat == null ? 0 : responseFormat!.hashCode);

  @override
  String toString() => 'CreateAssistantRequest[model=$model, name=$name, description=$description, instructions=$instructions, tools=$tools, toolResources=$toolResources, metadata=$metadata, temperature=$temperature, topP=$topP, responseFormat=$responseFormat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'model'] = this.model;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.instructions != null) {
      json[r'instructions'] = this.instructions;
    } else {
      json[r'instructions'] = null;
    }
      json[r'tools'] = this.tools;
    if (this.toolResources != null) {
      json[r'tool_resources'] = this.toolResources;
    } else {
      json[r'tool_resources'] = null;
    }
    if (this.metadata != null) {
      json[r'metadata'] = this.metadata;
    } else {
      json[r'metadata'] = null;
    }
    if (this.temperature != null) {
      json[r'temperature'] = this.temperature;
    } else {
      json[r'temperature'] = null;
    }
    if (this.topP != null) {
      json[r'top_p'] = this.topP;
    } else {
      json[r'top_p'] = null;
    }
    if (this.responseFormat != null) {
      json[r'response_format'] = this.responseFormat;
    } else {
      json[r'response_format'] = null;
    }
    return json;
  }

  /// Returns a new [CreateAssistantRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssistantRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateAssistantRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateAssistantRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateAssistantRequest(
        model: CreateAssistantRequestModel.fromJson(json[r'model'])!,
        name: mapValueOfType<String>(json, r'name'),
        description: mapValueOfType<String>(json, r'description'),
        instructions: mapValueOfType<String>(json, r'instructions'),
        tools: AssistantObjectToolsInner.listFromJson(json[r'tools']),
        toolResources: CreateAssistantRequestToolResources.fromJson(json[r'tool_resources']),
        metadata: mapValueOfType<Object>(json, r'metadata'),
        temperature: json[r'temperature'] == null
            ? 1
            : num.parse('${json[r'temperature']}'),
        topP: json[r'top_p'] == null
            ? 1
            : num.parse('${json[r'top_p']}'),
        responseFormat: AssistantsApiResponseFormatOption.fromJson(json[r'response_format']),
      );
    }
    return null;
  }

  static List<CreateAssistantRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssistantRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssistantRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssistantRequest> mapFromJson(dynamic json) {
    final map = <String, CreateAssistantRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssistantRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssistantRequest-objects as value to a dart map
  static Map<String, List<CreateAssistantRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssistantRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssistantRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'model',
  };
}

