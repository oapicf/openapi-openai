//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageContentTextAnnotationsFileCitationObject {
  /// Returns a new [MessageContentTextAnnotationsFileCitationObject] instance.
  MessageContentTextAnnotationsFileCitationObject({
    required this.type,
    required this.text,
    required this.fileCitation,
    required this.startIndex,
    required this.endIndex,
  });

  /// Always `file_citation`.
  MessageContentTextAnnotationsFileCitationObjectTypeEnum type;

  /// The text in the message content that needs to be replaced.
  String text;

  MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

  /// Minimum value: 0
  int startIndex;

  /// Minimum value: 0
  int endIndex;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageContentTextAnnotationsFileCitationObject &&
    other.type == type &&
    other.text == text &&
    other.fileCitation == fileCitation &&
    other.startIndex == startIndex &&
    other.endIndex == endIndex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (text.hashCode) +
    (fileCitation.hashCode) +
    (startIndex.hashCode) +
    (endIndex.hashCode);

  @override
  String toString() => 'MessageContentTextAnnotationsFileCitationObject[type=$type, text=$text, fileCitation=$fileCitation, startIndex=$startIndex, endIndex=$endIndex]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'text'] = this.text;
      json[r'file_citation'] = this.fileCitation;
      json[r'start_index'] = this.startIndex;
      json[r'end_index'] = this.endIndex;
    return json;
  }

  /// Returns a new [MessageContentTextAnnotationsFileCitationObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageContentTextAnnotationsFileCitationObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageContentTextAnnotationsFileCitationObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageContentTextAnnotationsFileCitationObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageContentTextAnnotationsFileCitationObject(
        type: MessageContentTextAnnotationsFileCitationObjectTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text')!,
        fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation.fromJson(json[r'file_citation'])!,
        startIndex: mapValueOfType<int>(json, r'start_index')!,
        endIndex: mapValueOfType<int>(json, r'end_index')!,
      );
    }
    return null;
  }

  static List<MessageContentTextAnnotationsFileCitationObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFileCitationObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFileCitationObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageContentTextAnnotationsFileCitationObject> mapFromJson(dynamic json) {
    final map = <String, MessageContentTextAnnotationsFileCitationObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageContentTextAnnotationsFileCitationObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageContentTextAnnotationsFileCitationObject-objects as value to a dart map
  static Map<String, List<MessageContentTextAnnotationsFileCitationObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageContentTextAnnotationsFileCitationObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageContentTextAnnotationsFileCitationObject.listFromJson(entry.value, growable: growable,);
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
  };
}

/// Always `file_citation`.
class MessageContentTextAnnotationsFileCitationObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageContentTextAnnotationsFileCitationObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileCitation = MessageContentTextAnnotationsFileCitationObjectTypeEnum._(r'file_citation');

  /// List of all possible values in this [enum][MessageContentTextAnnotationsFileCitationObjectTypeEnum].
  static const values = <MessageContentTextAnnotationsFileCitationObjectTypeEnum>[
    fileCitation,
  ];

  static MessageContentTextAnnotationsFileCitationObjectTypeEnum? fromJson(dynamic value) => MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageContentTextAnnotationsFileCitationObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageContentTextAnnotationsFileCitationObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageContentTextAnnotationsFileCitationObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageContentTextAnnotationsFileCitationObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageContentTextAnnotationsFileCitationObjectTypeEnum].
class MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer {
  factory MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer() => _instance ??= const MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer._();

  const MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer._();

  String encode(MessageContentTextAnnotationsFileCitationObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageContentTextAnnotationsFileCitationObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageContentTextAnnotationsFileCitationObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_citation': return MessageContentTextAnnotationsFileCitationObjectTypeEnum.fileCitation;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer] instance.
  static MessageContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer? _instance;
}


