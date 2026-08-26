//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextObjectTextAnnotationsInner {
  /// Returns a new [MessageContentTextObjectTextAnnotationsInner] instance.
  MessageContentTextObjectTextAnnotationsInner({
    required this.type,
    required this.text,
    required this.fileCitation,
    required this.startIndex,
    required this.endIndex,
    required this.filePath,
  });

  /// Always `file_citation`.
  MessageContentTextObjectTextAnnotationsInnerTypeEnum type;

  /// The text in the message content that needs to be replaced.
  String text;

  MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  /// Minimum value: 0
  int startIndex;

  /// Minimum value: 0
  int endIndex;

  MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextObjectTextAnnotationsInner &&
    other.type == type &&
    other.text == text &&
    other.fileCitation == fileCitation &&
    other.startIndex == startIndex &&
    other.endIndex == endIndex &&
    other.filePath == filePath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode) +
    (fileCitation.hashCode) +
    (startIndex.hashCode) +
    (endIndex.hashCode) +
    (filePath.hashCode);

  @override
  String toString() => 'MessageContentTextObjectTextAnnotationsInner[type=$type, text=$text, fileCitation=$fileCitation, startIndex=$startIndex, endIndex=$endIndex, filePath=$filePath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
      json[r'file_citation'] = this.fileCitation;
      json[r'start_index'] = this.startIndex;
      json[r'end_index'] = this.endIndex;
      json[r'file_path'] = this.filePath;
    return json;
  }

  /// Returns a new [MessageContentTextObjectTextAnnotationsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextObjectTextAnnotationsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'type'), 'Required key "MessageContentTextObjectTextAnnotationsInner[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[type]" has a null value in JSON.');
        assert(json.containsKey(r'text'), 'Required key "MessageContentTextObjectTextAnnotationsInner[text]" is missing from JSON.');
        assert(json[r'text'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[text]" has a null value in JSON.');
        assert(json.containsKey(r'file_citation'), 'Required key "MessageContentTextObjectTextAnnotationsInner[file_citation]" is missing from JSON.');
        assert(json[r'file_citation'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[file_citation]" has a null value in JSON.');
        assert(json.containsKey(r'start_index'), 'Required key "MessageContentTextObjectTextAnnotationsInner[start_index]" is missing from JSON.');
        assert(json[r'start_index'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[start_index]" has a null value in JSON.');
        assert(json.containsKey(r'end_index'), 'Required key "MessageContentTextObjectTextAnnotationsInner[end_index]" is missing from JSON.');
        assert(json[r'end_index'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[end_index]" has a null value in JSON.');
        assert(json.containsKey(r'file_path'), 'Required key "MessageContentTextObjectTextAnnotationsInner[file_path]" is missing from JSON.');
        assert(json[r'file_path'] != null, 'Required key "MessageContentTextObjectTextAnnotationsInner[file_path]" has a null value in JSON.');
        return true;
      }());

      return MessageContentTextObjectTextAnnotationsInner(
        type: MessageContentTextObjectTextAnnotationsInnerTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
        fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation.fromJson(json[r'file_citation'])!,
        startIndex: mapValueOfType<int>(json, r'start_index')!,
        endIndex: mapValueOfType<int>(json, r'end_index')!,
        filePath: MessageContentTextAnnotationsFilePathObjectFilePath.fromJson(json[r'file_path'])!,
      );
    }
    return null;
  }

  static List<MessageContentTextObjectTextAnnotationsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextObjectTextAnnotationsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextObjectTextAnnotationsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextObjectTextAnnotationsInner> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextObjectTextAnnotationsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextObjectTextAnnotationsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextObjectTextAnnotationsInner-objects as value to a dart map
  static Map<String, List<MessageContentTextObjectTextAnnotationsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextObjectTextAnnotationsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextObjectTextAnnotationsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'text',
    'file_citation',
    'start_index',
    'end_index',
    'file_path',
  };
}

/// Always `file_citation`.
enum MessageContentTextObjectTextAnnotationsInnerTypeEnum {
  fileCitation._(r'file_citation'),
  filePath._(r'file_path'),
  ;

  /// Instantiate a new enum with the provided value.
  const MessageContentTextObjectTextAnnotationsInnerTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MessageContentTextObjectTextAnnotationsInnerTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MessageContentTextObjectTextAnnotationsInnerTypeEnum? fromJson(dynamic value) => MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MessageContentTextObjectTextAnnotationsInnerTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MessageContentTextObjectTextAnnotationsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextObjectTextAnnotationsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextObjectTextAnnotationsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentTextObjectTextAnnotationsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [MessageContentTextObjectTextAnnotationsInnerTypeEnum].
class MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer {
  factory MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer() => _instance ??= const MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer._();

  const MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer._();

  String encode(MessageContentTextObjectTextAnnotationsInnerTypeEnum data) => data._value;

  /// Returns the instance of [MessageContentTextObjectTextAnnotationsInnerTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentTextObjectTextAnnotationsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is MessageContentTextObjectTextAnnotationsInnerTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'file_citation': return MessageContentTextObjectTextAnnotationsInnerTypeEnum.fileCitation;
        case r'file_path': return MessageContentTextObjectTextAnnotationsInnerTypeEnum.filePath;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MessageContentTextObjectTextAnnotationsInnerTypeEnumTypeTransformer? _instance;
}


