//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextObjectText {
  /// Returns a new [MessageContentTextObjectText] instance.
  MessageContentTextObjectText({
    required this.value,
    this.annotations = const [],
  });

  /// The data that makes up the text.
  String value;

  List<MessageContentTextObjectTextAnnotationsInner> annotations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextObjectText &&
    other.value == value &&
    _deepEquality.equals(other.annotations, annotations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (value.hashCode) +
    (annotations.hashCode);

  @override
  String toString() => 'MessageContentTextObjectText[value=$value, annotations=$annotations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'value'] = this.value;
      json[r'annotations'] = this.annotations;
    return json;
  }

  /// Returns a new [MessageContentTextObjectText] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextObjectText? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentTextObjectText[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentTextObjectText[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentTextObjectText(
        value: mapValueOfType<String>(json, r'value')!,
        annotations: MessageContentTextObjectTextAnnotationsInner.listFromJson(json[r'annotations']),
      );
    }
    return null;
  }

  static List<MessageContentTextObjectText> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextObjectText>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextObjectText.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextObjectText> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextObjectText>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextObjectText.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextObjectText-objects as value to a dart map
  static Map<String, List<MessageContentTextObjectText>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextObjectText>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextObjectText.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'value',
    'annotations',
  };
}

