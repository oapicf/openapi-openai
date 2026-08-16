//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentImageUrlObject {
  /// Returns a new [MessageDeltaContentImageUrlObject] instance.
  MessageDeltaContentImageUrlObject({
    required this.index,
    required this.type,
    this.imageUrl,
  });

  /// The index of the content part in the message.
  int index;

  /// Always `image_url`.
  MessageDeltaContentImageUrlObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentImageUrlObjectImageUrl? imageUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentImageUrlObject &&
    other.index == index &&
    other.type == type &&
    other.imageUrl == imageUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (imageUrl == null ? 0 : imageUrl!.hashCode);

  @override
  String toString() => 'MessageDeltaContentImageUrlObject[index=$index, type=$type, imageUrl=$imageUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.imageUrl != null) {
      json[r'image_url'] = this.imageUrl;
    } else {
      json[r'image_url'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentImageUrlObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentImageUrlObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentImageUrlObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentImageUrlObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentImageUrlObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentImageUrlObjectTypeEnum.fromJson(json[r'type'])!,
        imageUrl: MessageDeltaContentImageUrlObjectImageUrl.fromJson(json[r'image_url']),
      );
    }
    return null;
  }

  static List<MessageDeltaContentImageUrlObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageUrlObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageUrlObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentImageUrlObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentImageUrlObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentImageUrlObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentImageUrlObject-objects as value to a dart map
  static Map<String, List<MessageDeltaContentImageUrlObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentImageUrlObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentImageUrlObject.listFromJson(entry.value, growable: growable,);
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

/// Always `image_url`.
class MessageDeltaContentImageUrlObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentImageUrlObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageUrl = MessageDeltaContentImageUrlObjectTypeEnum._(r'image_url');

  /// List of all possible values in this [enum][MessageDeltaContentImageUrlObjectTypeEnum].
  static const values = <MessageDeltaContentImageUrlObjectTypeEnum>[
    imageUrl,
  ];

  static MessageDeltaContentImageUrlObjectTypeEnum? fromJson(dynamic value) => MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentImageUrlObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageUrlObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageUrlObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentImageUrlObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentImageUrlObjectTypeEnum].
class MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer {
  factory MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer._();

  const MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentImageUrlObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentImageUrlObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentImageUrlObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_url': return MessageDeltaContentImageUrlObjectTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer] instance.
  static MessageDeltaContentImageUrlObjectTypeEnumTypeTransformer? _instance;
}


