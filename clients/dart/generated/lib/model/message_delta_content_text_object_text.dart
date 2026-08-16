//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentTextObjectText {
  /// Returns a new [MessageDeltaContentTextObjectText] instance.
  MessageDeltaContentTextObjectText({
    this.value,
    this.annotations = const [],
  });

  /// The data that makes up the text.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? value;

  List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentTextObjectText &&
    other.value == value &&
    _deepEquality.equals(other.annotations, annotations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (value == null ? 0 : value!.hashCode) +
    (annotations.hashCode);

  @override
  String toString() => 'MessageDeltaContentTextObjectText[value=$value, annotations=$annotations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
      json[r'annotations'] = this.annotations;
    return json;
  }

  /// Returns a new [MessageDeltaContentTextObjectText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentTextObjectText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentTextObjectText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentTextObjectText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentTextObjectText(
        value: mapValueOfType<String>(json, r'value'),
        annotations: MessageDeltaContentTextObjectTextAnnotationsInner.listFromJson(json[r'annotations']),
      );
    }
    return null;
  }

  static List<MessageDeltaContentTextObjectText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextObjectText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextObjectText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentTextObjectText> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentTextObjectText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentTextObjectText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentTextObjectText-objects as value to a dart map
  static Map<String, List<MessageDeltaContentTextObjectText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentTextObjectText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentTextObjectText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

