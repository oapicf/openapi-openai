//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageRequestContentTextObject {
  /// Returns a new [MessageRequestContentTextObject] instance.
  MessageRequestContentTextObject({
    required this.type,
    required this.text,
  });

  /// Always `text`.
  MessageRequestContentTextObjectTypeEnum type;

  /// Text content to be sent to the model
  String text;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageRequestContentTextObject &&
    other.type == type &&
    other.text == text;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode);

  @override
  String toString() => 'MessageRequestContentTextObject[type=$type, text=$text]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
    return json;
  }

  /// Returns a new [MessageRequestContentTextObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageRequestContentTextObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageRequestContentTextObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageRequestContentTextObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageRequestContentTextObject(
        type: MessageRequestContentTextObjectTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
      );
    }
    return null;
  }

  static List<MessageRequestContentTextObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageRequestContentTextObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageRequestContentTextObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageRequestContentTextObject> mapFromJson(dynamic json) {
    final map = <String, MessageRequestContentTextObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageRequestContentTextObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageRequestContentTextObject-objects as value to a dart map
  static Map<String, List<MessageRequestContentTextObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageRequestContentTextObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageRequestContentTextObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'text',
  };
}

/// Always `text`.
class MessageRequestContentTextObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageRequestContentTextObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = MessageRequestContentTextObjectTypeEnum._(r'text');

  /// List of all possible values in this [enum][MessageRequestContentTextObjectTypeEnum].
  static const values = <MessageRequestContentTextObjectTypeEnum>[
    text,
  ];

  static MessageRequestContentTextObjectTypeEnum? fromJson(dynamic value) => MessageRequestContentTextObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageRequestContentTextObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageRequestContentTextObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageRequestContentTextObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageRequestContentTextObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageRequestContentTextObjectTypeEnum].
class MessageRequestContentTextObjectTypeEnumTypeTransformer {
  factory MessageRequestContentTextObjectTypeEnumTypeTransformer() => _instance ??= const MessageRequestContentTextObjectTypeEnumTypeTransformer._();

  const MessageRequestContentTextObjectTypeEnumTypeTransformer._();

  String encode(MessageRequestContentTextObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageRequestContentTextObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageRequestContentTextObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return MessageRequestContentTextObjectTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageRequestContentTextObjectTypeEnumTypeTransformer] instance.
  static MessageRequestContentTextObjectTypeEnumTypeTransformer? _instance;
}


