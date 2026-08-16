//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentTextObject {
  /// Returns a new [MessageDeltaContentTextObject] instance.
  MessageDeltaContentTextObject({
    required this.index,
    required this.type,
    this.text,
  });

  /// The index of the content part in the message.
  int index;

  /// Always `text`.
  MessageDeltaContentTextObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentTextObjectText? text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentTextObject &&
    other.index == index &&
    other.type == type &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (text == null ? 0 : text!.hashCode);

  @override
  String toString() => 'MessageDeltaContentTextObject[index=$index, type=$type, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentTextObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentTextObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentTextObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentTextObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentTextObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentTextObjectTypeEnum.fromJson(json[r'type'])!,
        text: MessageDeltaContentTextObjectText.fromJson(json[r'text']),
      );
    }
    return null;
  }

  static List<MessageDeltaContentTextObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentTextObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentTextObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentTextObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentTextObject-objects as value to a dart map
  static Map<String, List<MessageDeltaContentTextObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentTextObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentTextObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
    'type',
  };
}

/// Always `text`.
class MessageDeltaContentTextObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentTextObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = MessageDeltaContentTextObjectTypeEnum._(r'text');

  /// List of all possible values in this [enum][MessageDeltaContentTextObjectTypeEnum].
  static const values = <MessageDeltaContentTextObjectTypeEnum>[
    text,
  ];

  static MessageDeltaContentTextObjectTypeEnum? fromJson(dynamic value) => MessageDeltaContentTextObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentTextObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentTextObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentTextObjectTypeEnum].
class MessageDeltaContentTextObjectTypeEnumTypeTransformer {
  factory MessageDeltaContentTextObjectTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentTextObjectTypeEnumTypeTransformer._();

  const MessageDeltaContentTextObjectTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentTextObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentTextObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentTextObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return MessageDeltaContentTextObjectTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentTextObjectTypeEnumTypeTransformer] instance.
  static MessageDeltaContentTextObjectTypeEnumTypeTransformer? _instance;
}


