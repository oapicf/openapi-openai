//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
  /// Returns a new [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] instance.
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation({
    this.fileId,
    this.quote,
  });

  /// The ID of the specific File the citation is from.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fileId;

  /// The specific quote in the file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? quote;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation &&
    other.fileId == fileId &&
    other.quote == quote;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId == null ? 0 : fileId!.hashCode) +
    (quote == null ? 0 : quote!.hashCode);

  @override
  String toString() => 'MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation[fileId=$fileId, quote=$quote]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fileId != null) {
      json[r'file_id'] = this.fileId;
    } else {
      json[r'file_id'] = null;
    }
    if (this.quote != null) {
      json[r'quote'] = this.quote;
    } else {
      json[r'quote'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
        fileId: mapValueOfType<String>(json, r'file_id'),
        quote: mapValueOfType<String>(json, r'quote'),
      );
    }
    return null;
  }

  static List<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation-objects as value to a dart map
  static Map<String, List<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

