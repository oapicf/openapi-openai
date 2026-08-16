//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentImageFileObjectImageFile {
  /// Returns a new [MessageDeltaContentImageFileObjectImageFile] instance.
  MessageDeltaContentImageFileObjectImageFile({
    this.fileId,
    this.detail = const MessageDeltaContentImageFileObjectImageFileDetailEnum._('auto'),
  });

  /// The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fileId;

  /// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  MessageDeltaContentImageFileObjectImageFileDetailEnum detail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentImageFileObjectImageFile &&
    other.fileId == fileId &&
    other.detail == detail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId == null ? 0 : fileId!.hashCode) +
    (detail.hashCode);

  @override
  String toString() => 'MessageDeltaContentImageFileObjectImageFile[fileId=$fileId, detail=$detail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fileId != null) {
      json[r'file_id'] = this.fileId;
    } else {
      json[r'file_id'] = null;
    }
      json[r'detail'] = this.detail;
    return json;
  }

  /// Returns a new [MessageDeltaContentImageFileObjectImageFile] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentImageFileObjectImageFile? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentImageFileObjectImageFile[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentImageFileObjectImageFile[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentImageFileObjectImageFile(
        fileId: mapValueOfType<String>(json, r'file_id'),
        detail: MessageDeltaContentImageFileObjectImageFileDetailEnum.fromJson(json[r'detail']) ?? 'auto',
      );
    }
    return null;
  }

  static List<MessageDeltaContentImageFileObjectImageFile> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageFileObjectImageFile>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageFileObjectImageFile.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentImageFileObjectImageFile> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentImageFileObjectImageFile>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentImageFileObjectImageFile.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentImageFileObjectImageFile-objects as value to a dart map
  static Map<String, List<MessageDeltaContentImageFileObjectImageFile>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentImageFileObjectImageFile>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentImageFileObjectImageFile.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
class MessageDeltaContentImageFileObjectImageFileDetailEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentImageFileObjectImageFileDetailEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = MessageDeltaContentImageFileObjectImageFileDetailEnum._(r'auto');
  static const low = MessageDeltaContentImageFileObjectImageFileDetailEnum._(r'low');
  static const high = MessageDeltaContentImageFileObjectImageFileDetailEnum._(r'high');

  /// List of all possible values in this [enum][MessageDeltaContentImageFileObjectImageFileDetailEnum].
  static const values = <MessageDeltaContentImageFileObjectImageFileDetailEnum>[
    auto,
    low,
    high,
  ];

  static MessageDeltaContentImageFileObjectImageFileDetailEnum? fromJson(dynamic value) => MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentImageFileObjectImageFileDetailEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageFileObjectImageFileDetailEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageFileObjectImageFileDetailEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentImageFileObjectImageFileDetailEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentImageFileObjectImageFileDetailEnum].
class MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer {
  factory MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer() => _instance ??= const MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer._();

  const MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer._();

  String encode(MessageDeltaContentImageFileObjectImageFileDetailEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentImageFileObjectImageFileDetailEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentImageFileObjectImageFileDetailEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return MessageDeltaContentImageFileObjectImageFileDetailEnum.auto;
        case r'low': return MessageDeltaContentImageFileObjectImageFileDetailEnum.low;
        case r'high': return MessageDeltaContentImageFileObjectImageFileDetailEnum.high;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer] instance.
  static MessageDeltaContentImageFileObjectImageFileDetailEnumTypeTransformer? _instance;
}


