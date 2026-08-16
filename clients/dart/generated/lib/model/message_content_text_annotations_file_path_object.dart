//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextAnnotationsFilePathObject {
  /// Returns a new [MessageContentTextAnnotationsFilePathObject] instance.
  MessageContentTextAnnotationsFilePathObject({
    required this.type,
    required this.text,
    required this.filePath,
    required this.startIndex,
    required this.endIndex,
  });

  /// Always `file_path`.
  MessageContentTextAnnotationsFilePathObjectTypeEnum type;

  /// The text in the message content that needs to be replaced.
  String text;

  MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  /// Minimum value: 0
  int startIndex;

  /// Minimum value: 0
  int endIndex;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextAnnotationsFilePathObject &&
    other.type == type &&
    other.text == text &&
    other.filePath == filePath &&
    other.startIndex == startIndex &&
    other.endIndex == endIndex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode) +
    (filePath.hashCode) +
    (startIndex.hashCode) +
    (endIndex.hashCode);

  @override
  String toString() => 'MessageContentTextAnnotationsFilePathObject[type=$type, text=$text, filePath=$filePath, startIndex=$startIndex, endIndex=$endIndex]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
      json[r'file_path'] = this.filePath;
      json[r'start_index'] = this.startIndex;
      json[r'end_index'] = this.endIndex;
    return json;
  }

  /// Returns a new [MessageContentTextAnnotationsFilePathObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextAnnotationsFilePathObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentTextAnnotationsFilePathObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentTextAnnotationsFilePathObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentTextAnnotationsFilePathObject(
        type: MessageContentTextAnnotationsFilePathObjectTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
        filePath: MessageContentTextAnnotationsFilePathObjectFilePath.fromJson(json[r'file_path'])!,
        startIndex: mapValueOfType<int>(json, r'start_index')!,
        endIndex: mapValueOfType<int>(json, r'end_index')!,
      );
    }
    return null;
  }

  static List<MessageContentTextAnnotationsFilePathObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFilePathObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFilePathObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextAnnotationsFilePathObject> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextAnnotationsFilePathObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextAnnotationsFilePathObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextAnnotationsFilePathObject-objects as value to a dart map
  static Map<String, List<MessageContentTextAnnotationsFilePathObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextAnnotationsFilePathObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextAnnotationsFilePathObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'text',
    'file_path',
    'start_index',
    'end_index',
  };
}

/// Always `file_path`.
class MessageContentTextAnnotationsFilePathObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageContentTextAnnotationsFilePathObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const filePath = MessageContentTextAnnotationsFilePathObjectTypeEnum._(r'file_path');

  /// List of all possible values in this [enum][MessageContentTextAnnotationsFilePathObjectTypeEnum].
  static const values = <MessageContentTextAnnotationsFilePathObjectTypeEnum>[
    filePath,
  ];

  static MessageContentTextAnnotationsFilePathObjectTypeEnum? fromJson(dynamic value) => MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageContentTextAnnotationsFilePathObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFilePathObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFilePathObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentTextAnnotationsFilePathObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageContentTextAnnotationsFilePathObjectTypeEnum].
class MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer {
  factory MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer() => _instance ??= const MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer._();

  const MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer._();

  String encode(MessageContentTextAnnotationsFilePathObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageContentTextAnnotationsFilePathObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentTextAnnotationsFilePathObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_path': return MessageContentTextAnnotationsFilePathObjectTypeEnum.filePath;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer] instance.
  static MessageContentTextAnnotationsFilePathObjectTypeEnumTypeTransformer? _instance;
}


