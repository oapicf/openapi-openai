//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextAnnotationsFilePathObjectFilePath {
  /// Returns a new [MessageContentTextAnnotationsFilePathObjectFilePath] instance.
  MessageContentTextAnnotationsFilePathObjectFilePath({
    required this.fileId,
  });

  /// The ID of the file that was generated.
  String fileId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextAnnotationsFilePathObjectFilePath &&
    other.fileId == fileId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId.hashCode);

  @override
  String toString() => 'MessageContentTextAnnotationsFilePathObjectFilePath[fileId=$fileId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_id'] = this.fileId;
    return json;
  }

  /// Returns a new [MessageContentTextAnnotationsFilePathObjectFilePath] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextAnnotationsFilePathObjectFilePath? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentTextAnnotationsFilePathObjectFilePath[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentTextAnnotationsFilePathObjectFilePath[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentTextAnnotationsFilePathObjectFilePath(
        fileId: mapValueOfType<String>(json, r'file_id')!,
      );
    }
    return null;
  }

  static List<MessageContentTextAnnotationsFilePathObjectFilePath> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFilePathObjectFilePath>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFilePathObjectFilePath.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextAnnotationsFilePathObjectFilePath> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextAnnotationsFilePathObjectFilePath>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextAnnotationsFilePathObjectFilePath.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextAnnotationsFilePathObjectFilePath-objects as value to a dart map
  static Map<String, List<MessageContentTextAnnotationsFilePathObjectFilePath>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextAnnotationsFilePathObjectFilePath>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextAnnotationsFilePathObjectFilePath.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'file_id',
  };
}

