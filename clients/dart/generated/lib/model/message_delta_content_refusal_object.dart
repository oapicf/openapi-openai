//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentRefusalObject {
  /// Returns a new [MessageDeltaContentRefusalObject] instance.
  MessageDeltaContentRefusalObject({
    required this.index,
    required this.type,
    this.refusal,
  });

  /// The index of the refusal part in the message.
  int index;

  /// Always `refusal`.
  MessageDeltaContentRefusalObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? refusal;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentRefusalObject &&
    other.index == index &&
    other.type == type &&
    other.refusal == refusal;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (refusal == null ? 0 : refusal!.hashCode);

  @override
  String toString() => 'MessageDeltaContentRefusalObject[index=$index, type=$type, refusal=$refusal]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.refusal != null) {
      json[r'refusal'] = this.refusal;
    } else {
      json[r'refusal'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentRefusalObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentRefusalObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentRefusalObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentRefusalObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentRefusalObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentRefusalObjectTypeEnum.fromJson(json[r'type'])!,
        refusal: mapValueOfType<String>(json, r'refusal'),
      );
    }
    return null;
  }

  static List<MessageDeltaContentRefusalObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentRefusalObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentRefusalObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentRefusalObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentRefusalObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentRefusalObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentRefusalObject-objects as value to a dart map
  static Map<String, List<MessageDeltaContentRefusalObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentRefusalObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentRefusalObject.listFromJson(entry.value, growable: growable,);
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

/// Always `refusal`.
class MessageDeltaContentRefusalObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentRefusalObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const refusal = MessageDeltaContentRefusalObjectTypeEnum._(r'refusal');

  /// List of all possible values in this [enum][MessageDeltaContentRefusalObjectTypeEnum].
  static const values = <MessageDeltaContentRefusalObjectTypeEnum>[
    refusal,
  ];

  static MessageDeltaContentRefusalObjectTypeEnum? fromJson(dynamic value) => MessageDeltaContentRefusalObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentRefusalObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentRefusalObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentRefusalObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentRefusalObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentRefusalObjectTypeEnum].
class MessageDeltaContentRefusalObjectTypeEnumTypeTransformer {
  factory MessageDeltaContentRefusalObjectTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentRefusalObjectTypeEnumTypeTransformer._();

  const MessageDeltaContentRefusalObjectTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentRefusalObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentRefusalObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentRefusalObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'refusal': return MessageDeltaContentRefusalObjectTypeEnum.refusal;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentRefusalObjectTypeEnumTypeTransformer] instance.
  static MessageDeltaContentRefusalObjectTypeEnumTypeTransformer? _instance;
}


