//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuneChatRequestInput {
  /// Returns a new [FineTuneChatRequestInput] instance.
  FineTuneChatRequestInput({
    this.messages = const [],
    this.tools = const [],
    this.parallelToolCalls = true,
    this.functions = const [],
  });

  List<FineTuneChatRequestInputMessagesInner> messages;

  /// A list of tools the model may generate JSON inputs for.
  List<ChatCompletionTool> tools;

  /// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  bool parallelToolCalls;

  /// A list of functions the model may generate JSON inputs for.
  List<ChatCompletionFunctions> functions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuneChatRequestInput &&
    _deepEquality.equals(other.messages, messages) &&
    _deepEquality.equals(other.tools, tools) &&
    other.parallelToolCalls == parallelToolCalls &&
    _deepEquality.equals(other.functions, functions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (messages.hashCode) +
    (tools.hashCode) +
    (parallelToolCalls.hashCode) +
    (functions.hashCode);

  @override
  String toString() => 'FineTuneChatRequestInput[messages=$messages, tools=$tools, parallelToolCalls=$parallelToolCalls, functions=$functions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'messages'] = this.messages;
      json[r'tools'] = this.tools;
      json[r'parallel_tool_calls'] = this.parallelToolCalls;
      json[r'functions'] = this.functions;
    return json;
  }

  /// Returns a new [FineTuneChatRequestInput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuneChatRequestInput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuneChatRequestInput[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuneChatRequestInput[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuneChatRequestInput(
        messages: FineTuneChatRequestInputMessagesInner.listFromJson(json[r'messages']),
        tools: ChatCompletionTool.listFromJson(json[r'tools']),
        parallelToolCalls: mapValueOfType<bool>(json, r'parallel_tool_calls') ?? true,
        functions: ChatCompletionFunctions.listFromJson(json[r'functions']),
      );
    }
    return null;
  }

  static List<FineTuneChatRequestInput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuneChatRequestInput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuneChatRequestInput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuneChatRequestInput> mapFromJson(dynamic json) {
    final map = <String, FineTuneChatRequestInput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuneChatRequestInput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuneChatRequestInput-objects as value to a dart map
  static Map<String, List<FineTuneChatRequestInput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuneChatRequestInput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuneChatRequestInput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

