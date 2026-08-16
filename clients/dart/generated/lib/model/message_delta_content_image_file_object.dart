//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentImageFileObject {
  /// Returns a new [MessageDeltaContentImageFileObject] instance.
  MessageDeltaContentImageFileObject({
    required this.index,
    required this.type,
    this.imageFile,
  });

  /// The index of the content part in the message.
  int index;

  /// Always `image_file`.
  MessageDeltaContentImageFileObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentImageFileObjectImageFile? imageFile;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentImageFileObject &&
    other.index == index &&
    other.type == type &&
    other.imageFile == imageFile;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (imageFile == null ? 0 : imageFile!.hashCode);

  @override
  String toString() => 'MessageDeltaContentImageFileObject[index=$index, type=$type, imageFile=$imageFile]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.imageFile != null) {
      json[r'image_file'] = this.imageFile;
    } else {
      json[r'image_file'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentImageFileObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentImageFileObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentImageFileObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentImageFileObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentImageFileObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentImageFileObjectTypeEnum.fromJson(json[r'type'])!,
        imageFile: MessageDeltaContentImageFileObjectImageFile.fromJson(json[r'image_file']),
      );
    }
    return null;
  }

  static List<MessageDeltaContentImageFileObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageFileObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageFileObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentImageFileObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentImageFileObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentImageFileObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentImageFileObject-objects as value to a dart map
  static Map<String, List<MessageDeltaContentImageFileObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentImageFileObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentImageFileObject.listFromJson(entry.value, growable: growable,);
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

/// Always `image_file`.
class MessageDeltaContentImageFileObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentImageFileObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageFile = MessageDeltaContentImageFileObjectTypeEnum._(r'image_file');

  /// List of all possible values in this [enum][MessageDeltaContentImageFileObjectTypeEnum].
  static const values = <MessageDeltaContentImageFileObjectTypeEnum>[
    imageFile,
  ];

  static MessageDeltaContentImageFileObjectTypeEnum? fromJson(dynamic value) => MessageDeltaContentImageFileObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentImageFileObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageFileObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageFileObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentImageFileObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentImageFileObjectTypeEnum].
class MessageDeltaContentImageFileObjectTypeEnumTypeTransformer {
  factory MessageDeltaContentImageFileObjectTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentImageFileObjectTypeEnumTypeTransformer._();

  const MessageDeltaContentImageFileObjectTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentImageFileObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentImageFileObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentImageFileObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image_file': return MessageDeltaContentImageFileObjectTypeEnum.imageFile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentImageFileObjectTypeEnumTypeTransformer] instance.
  static MessageDeltaContentImageFileObjectTypeEnumTypeTransformer? _instance;
}


