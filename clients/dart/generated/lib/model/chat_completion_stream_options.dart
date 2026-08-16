//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChatCompletionStreamOptions {
  /// Returns a new [ChatCompletionStreamOptions] instance.
  ChatCompletionStreamOptions({
    this.includeUsage,
  });

  /// If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? includeUsage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChatCompletionStreamOptions &&
    other.includeUsage == includeUsage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (includeUsage == null ? 0 : includeUsage!.hashCode);

  @override
  String toString() => 'ChatCompletionStreamOptions[includeUsage=$includeUsage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.includeUsage != null) {
      json[r'include_usage'] = this.includeUsage;
    } else {
      json[r'include_usage'] = null;
    }
    return json;
  }

  /// Returns a new [ChatCompletionStreamOptions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChatCompletionStreamOptions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChatCompletionStreamOptions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChatCompletionStreamOptions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChatCompletionStreamOptions(
        includeUsage: mapValueOfType<bool>(json, r'include_usage'),
      );
    }
    return null;
  }

  static List<ChatCompletionStreamOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChatCompletionStreamOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChatCompletionStreamOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChatCompletionStreamOptions> mapFromJson(dynamic json) {
    final map = <String, ChatCompletionStreamOptions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChatCompletionStreamOptions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChatCompletionStreamOptions-objects as value to a dart map
  static Map<String, List<ChatCompletionStreamOptions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChatCompletionStreamOptions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChatCompletionStreamOptions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

