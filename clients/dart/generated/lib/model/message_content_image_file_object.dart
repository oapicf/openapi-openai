//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentImageFileObject {
  /// Returns a new [MessageContentImageFileObject] instance.
  MessageContentImageFileObject({
    required this.type,
    required this.imageFile,
  });

  /// Always `image_file`.
  MessageContentImageFileObjectTypeEnum type;

  MessageContentImageFileObjectImageFile imageFile;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentImageFileObject &&
    other.type == type &&
    other.imageFile == imageFile;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (imageFile.hashCode);

  @override
  String toString() => 'MessageContentImageFileObject[type=$type, imageFile=$imageFile]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'image_file'] = this.imageFile;
    return json;
  }

  /// Returns a new [MessageContentImageFileObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentImageFileObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentImageFileObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentImageFileObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentImageFileObject(
        type: MessageContentImageFileObjectTypeEnum.fromJson(json[r'type'])!,
        imageFile: MessageContentImageFileObjectImageFile.fromJson(json[r'image_file'])!,
      );
    }
    return null;
  }

  static List<MessageContentImageFileObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageFileObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageFileObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentImageFileObject> mapFromJson(dynamic json) {
    final map = <String, MessageContentImageFileObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentImageFileObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentImageFileObject-objects as value to a dart map
  static Map<String, List<MessageContentImageFileObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentImageFileObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentImageFileObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'image_file',
  };
}

/// Always `image_file`.
class MessageContentImageFileObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageContentImageFileObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageFile = MessageContentImageFileObjectTypeEnum._(r'image_file');

  /// List of all possible values in this [enum][MessageContentImageFileObjectTypeEnum].
  static const values = <MessageContentImageFileObjectTypeEnum>[
    imageFile,
  ];

  static MessageContentImageFileObjectTypeEnum? fromJson(dynamic value) => MessageContentImageFileObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageContentImageFileObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageFileObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageFileObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentImageFileObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageContentImageFileObjectTypeEnum].
class MessageContentImageFileObjectTypeEnumTypeTransformer {
  factory MessageContentImageFileObjectTypeEnumTypeTransformer() => _instance ??= const MessageContentImageFileObjectTypeEnumTypeTransformer._();

  const MessageContentImageFileObjectTypeEnumTypeTransformer._();

  String encode(MessageContentImageFileObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageContentImageFileObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentImageFileObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_file': return MessageContentImageFileObjectTypeEnum.imageFile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageContentImageFileObjectTypeEnumTypeTransformer] instance.
  static MessageContentImageFileObjectTypeEnumTypeTransformer? _instance;
}


