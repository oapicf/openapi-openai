//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateMessageRequestAttachmentsInner {
  /// Returns a new [CreateMessageRequestAttachmentsInner] instance.
  CreateMessageRequestAttachmentsInner({
    this.fileId,
    this.tools = const [],
  });

  /// The ID of the file to attach to the message.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fileId;

  /// The tools to add this file to.
  List<CreateMessageRequestAttachmentsInnerToolsInner> tools;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateMessageRequestAttachmentsInner &&
    other.fileId == fileId &&
    _deepEquality.equals(other.tools, tools);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId == null ? 0 : fileId!.hashCode) +
    (tools.hashCode);

  @override
  String toString() => 'CreateMessageRequestAttachmentsInner[fileId=$fileId, tools=$tools]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fileId != null) {
      json[r'file_id'] = this.fileId;
    } else {
      json[r'file_id'] = null;
    }
      json[r'tools'] = this.tools;
    return json;
  }

  /// Returns a new [CreateMessageRequestAttachmentsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateMessageRequestAttachmentsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateMessageRequestAttachmentsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateMessageRequestAttachmentsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateMessageRequestAttachmentsInner(
        fileId: mapValueOfType<String>(json, r'file_id'),
        tools: CreateMessageRequestAttachmentsInnerToolsInner.listFromJson(json[r'tools']),
      );
    }
    return null;
  }

  static List<CreateMessageRequestAttachmentsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMessageRequestAttachmentsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMessageRequestAttachmentsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateMessageRequestAttachmentsInner> mapFromJson(dynamic json) {
    final map = <String, CreateMessageRequestAttachmentsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateMessageRequestAttachmentsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateMessageRequestAttachmentsInner-objects as value to a dart map
  static Map<String, List<CreateMessageRequestAttachmentsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateMessageRequestAttachmentsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateMessageRequestAttachmentsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

