//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextAnnotationsFileCitationObjectFileCitation {
  /// Returns a new [MessageContentTextAnnotationsFileCitationObjectFileCitation] instance.
  MessageContentTextAnnotationsFileCitationObjectFileCitation({
    required this.fileId,
  });

  /// The ID of the specific File the citation is from.
  String fileId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextAnnotationsFileCitationObjectFileCitation &&
    other.fileId == fileId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId.hashCode);

  @override
  String toString() => 'MessageContentTextAnnotationsFileCitationObjectFileCitation[fileId=$fileId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_id'] = this.fileId;
    return json;
  }

  /// Returns a new [MessageContentTextAnnotationsFileCitationObjectFileCitation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextAnnotationsFileCitationObjectFileCitation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentTextAnnotationsFileCitationObjectFileCitation[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentTextAnnotationsFileCitationObjectFileCitation[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentTextAnnotationsFileCitationObjectFileCitation(
        fileId: mapValueOfType<String>(json, r'file_id')!,
      );
    }
    return null;
  }

  static List<MessageContentTextAnnotationsFileCitationObjectFileCitation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFileCitationObjectFileCitation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFileCitationObjectFileCitation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextAnnotationsFileCitationObjectFileCitation> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextAnnotationsFileCitationObjectFileCitation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextAnnotationsFileCitationObjectFileCitation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextAnnotationsFileCitationObjectFileCitation-objects as value to a dart map
  static Map<String, List<MessageContentTextAnnotationsFileCitationObjectFileCitation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextAnnotationsFileCitationObjectFileCitation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextAnnotationsFileCitationObjectFileCitation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'file_id',
  };
}

