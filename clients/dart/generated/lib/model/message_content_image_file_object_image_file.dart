//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentImageFileObjectImageFile {
  /// Returns a new [MessageContentImageFileObjectImageFile] instance.
  MessageContentImageFileObjectImageFile({
    required this.fileId,
    this.detail = const MessageContentImageFileObjectImageFileDetailEnum._('auto'),
  });

  /// The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  String fileId;

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  MessageContentImageFileObjectImageFileDetailEnum detail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentImageFileObjectImageFile &&
    other.fileId == fileId &&
    other.detail == detail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId.hashCode) +
    (detail.hashCode);

  @override
  String toString() => 'MessageContentImageFileObjectImageFile[fileId=$fileId, detail=$detail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_id'] = this.fileId;
      json[r'detail'] = this.detail;
    return json;
  }

  /// Returns a new [MessageContentImageFileObjectImageFile] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentImageFileObjectImageFile? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentImageFileObjectImageFile[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentImageFileObjectImageFile[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentImageFileObjectImageFile(
        fileId: mapValueOfType<String>(json, r'file_id')!,
        detail: MessageContentImageFileObjectImageFileDetailEnum.fromJson(json[r'detail']) ?? 'auto',
      );
    }
    return null;
  }

  static List<MessageContentImageFileObjectImageFile> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageFileObjectImageFile>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageFileObjectImageFile.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentImageFileObjectImageFile> mapFromJson(dynamic json) {
    final map = <String, MessageContentImageFileObjectImageFile>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentImageFileObjectImageFile.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentImageFileObjectImageFile-objects as value to a dart map
  static Map<String, List<MessageContentImageFileObjectImageFile>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentImageFileObjectImageFile>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentImageFileObjectImageFile.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'file_id',
  };
}

/// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
class MessageContentImageFileObjectImageFileDetailEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageContentImageFileObjectImageFileDetailEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = MessageContentImageFileObjectImageFileDetailEnum._(r'auto');
  static const low = MessageContentImageFileObjectImageFileDetailEnum._(r'low');
  static const high = MessageContentImageFileObjectImageFileDetailEnum._(r'high');

  /// List of all possible values in this [enum][MessageContentImageFileObjectImageFileDetailEnum].
  static const values = <MessageContentImageFileObjectImageFileDetailEnum>[
    auto,
    low,
    high,
  ];

  static MessageContentImageFileObjectImageFileDetailEnum? fromJson(dynamic value) => MessageContentImageFileObjectImageFileDetailEnumTypeTransformer().decode(value);

  static List<MessageContentImageFileObjectImageFileDetailEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentImageFileObjectImageFileDetailEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentImageFileObjectImageFileDetailEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentImageFileObjectImageFileDetailEnum] to String,
/// and [decode] dynamic data back to [MessageContentImageFileObjectImageFileDetailEnum].
class MessageContentImageFileObjectImageFileDetailEnumTypeTransformer {
  factory MessageContentImageFileObjectImageFileDetailEnumTypeTransformer() => _instance ??= const MessageContentImageFileObjectImageFileDetailEnumTypeTransformer._();

  const MessageContentImageFileObjectImageFileDetailEnumTypeTransformer._();

  String encode(MessageContentImageFileObjectImageFileDetailEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageContentImageFileObjectImageFileDetailEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentImageFileObjectImageFileDetailEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return MessageContentImageFileObjectImageFileDetailEnum.auto;
        case r'low': return MessageContentImageFileObjectImageFileDetailEnum.low;
        case r'high': return MessageContentImageFileObjectImageFileDetailEnum.high;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageContentImageFileObjectImageFileDetailEnumTypeTransformer] instance.
  static MessageContentImageFileObjectImageFileDetailEnumTypeTransformer? _instance;
}


