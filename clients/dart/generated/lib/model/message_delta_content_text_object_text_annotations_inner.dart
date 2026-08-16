//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentTextObjectTextAnnotationsInner {
  /// Returns a new [MessageDeltaContentTextObjectTextAnnotationsInner] instance.
  MessageDeltaContentTextObjectTextAnnotationsInner({
    required this.index,
    required this.type,
    this.text,
    this.fileCitation,
    this.startIndex,
    this.endIndex,
    this.filePath,
  });

  /// The index of the annotation in the text content part.
  int index;

  /// Always `file_citation`.
  MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum type;

  /// The text in the message content that needs to be replaced.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? text;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? fileCitation;

  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startIndex;

  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? endIndex;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath? filePath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentTextObjectTextAnnotationsInner &&
    other.index == index &&
    other.type == type &&
    other.text == text &&
    other.fileCitation == fileCitation &&
    other.startIndex == startIndex &&
    other.endIndex == endIndex &&
    other.filePath == filePath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (fileCitation == null ? 0 : fileCitation!.hashCode) +
    (startIndex == null ? 0 : startIndex!.hashCode) +
    (endIndex == null ? 0 : endIndex!.hashCode) +
    (filePath == null ? 0 : filePath!.hashCode);

  @override
  String toString() => 'MessageDeltaContentTextObjectTextAnnotationsInner[index=$index, type=$type, text=$text, fileCitation=$fileCitation, startIndex=$startIndex, endIndex=$endIndex, filePath=$filePath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'type'] = this.type;
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    if (this.fileCitation != null) {
      json[r'file_citation'] = this.fileCitation;
    } else {
      json[r'file_citation'] = null;
    }
    if (this.startIndex != null) {
      json[r'start_index'] = this.startIndex;
    } else {
      json[r'start_index'] = null;
    }
    if (this.endIndex != null) {
      json[r'end_index'] = this.endIndex;
    } else {
      json[r'end_index'] = null;
    }
    if (this.filePath != null) {
      json[r'file_path'] = this.filePath;
    } else {
      json[r'file_path'] = null;
    }
    return json;
  }

  /// Returns a new [MessageDeltaContentTextObjectTextAnnotationsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentTextObjectTextAnnotationsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentTextObjectTextAnnotationsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentTextObjectTextAnnotationsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentTextObjectTextAnnotationsInner(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text'),
        fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(json[r'file_citation']),
        startIndex: mapValueOfType<int>(json, r'start_index'),
        endIndex: mapValueOfType<int>(json, r'end_index'),
        filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath.fromJson(json[r'file_path']),
      );
    }
    return null;
  }

  static List<MessageDeltaContentTextObjectTextAnnotationsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextObjectTextAnnotationsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextObjectTextAnnotationsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentTextObjectTextAnnotationsInner> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentTextObjectTextAnnotationsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentTextObjectTextAnnotationsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentTextObjectTextAnnotationsInner-objects as value to a dart map
  static Map<String, List<MessageDeltaContentTextObjectTextAnnotationsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentTextObjectTextAnnotationsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentTextObjectTextAnnotationsInner.listFromJson(entry.value, growable: growable,);
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

/// Always `file_citation`.
class MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileCitation = MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum._(r'file_citation');
  static const filePath = MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum._(r'file_path');

  /// List of all possible values in this [enum][MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum].
  static const values = <MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum>[
    fileCitation,
    filePath,
  ];

  static MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum? fromJson(dynamic value) => MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum].
class MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer {
  factory MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer._();

  const MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_citation': return MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum.fileCitation;
        case r'file_path': return MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnum.filePath;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer] instance.
  static MessageDeltaContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer? _instance;
}


