//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentImageUrlObject {
  /// Returns a new [MessageContentImageUrlObject] instance.
  MessageContentImageUrlObject({
    required this.type,
    required this.imageUrl,
  });

  /// The type of the content part.
  MessageContentImageUrlObjectTypeEnum type;

  MessageContentImageUrlObjectImageUrl imageUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentImageUrlObject &&
    other.type == type &&
    other.imageUrl == imageUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageUrl.hashCode);

  @override
  String toString() => 'MessageContentImageUrlObject[type=$type, imageUrl=$imageUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_url'] = this.imageUrl;
    return json;
  }

  /// Returns a new [MessageContentImageUrlObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentImageUrlObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentImageUrlObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentImageUrlObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentImageUrlObject(
        type: MessageContentImageUrlObjectTypeEnum.fromJson(json[r'type'])!,
        imageUrl: MessageContentImageUrlObjectImageUrl.fromJson(json[r'image_url'])!,
      );
    }
    return null;
  }

  static List<MessageContentImageUrlObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageUrlObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageUrlObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentImageUrlObject> mapFromJson(dynamic json) {
    final map = <String, MessageContentImageUrlObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentImageUrlObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentImageUrlObject-objects as value to a dart map
  static Map<String, List<MessageContentImageUrlObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentImageUrlObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentImageUrlObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image_url',
  };
}

/// The type of the content part.
class MessageContentImageUrlObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageContentImageUrlObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageUrl = MessageContentImageUrlObjectTypeEnum._(r'image_url');

  /// List of all possible values in this [enum][MessageContentImageUrlObjectTypeEnum].
  static const values = <MessageContentImageUrlObjectTypeEnum>[
    imageUrl,
  ];

  static MessageContentImageUrlObjectTypeEnum? fromJson(dynamic value) => MessageContentImageUrlObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageContentImageUrlObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageUrlObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageUrlObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentImageUrlObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageContentImageUrlObjectTypeEnum].
class MessageContentImageUrlObjectTypeEnumTypeTransformer {
  factory MessageContentImageUrlObjectTypeEnumTypeTransformer() => _instance ??= const MessageContentImageUrlObjectTypeEnumTypeTransformer._();

  const MessageContentImageUrlObjectTypeEnumTypeTransformer._();

  String encode(MessageContentImageUrlObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageContentImageUrlObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentImageUrlObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_url': return MessageContentImageUrlObjectTypeEnum.imageUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageContentImageUrlObjectTypeEnumTypeTransformer] instance.
  static MessageContentImageUrlObjectTypeEnumTypeTransformer? _instance;
}


