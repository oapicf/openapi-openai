//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentTextAnnotationsFileCitationObject {
  /// Returns a new [MessageDeltaContentTextAnnotationsFileCitationObject] instance.
  MessageDeltaContentTextAnnotationsFileCitationObject({
    required this.index,
    required this.type,
    this.text,
    this.fileCitation,
    this.startIndex,
    this.endIndex,
  });

  /// The index of the annotation in the text content part.
  int index;

  /// Always `file_citation`.
  MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum type;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentTextAnnotationsFileCitationObject &&
    other.index == index &&
    other.type == type &&
    other.text == text &&
    other.fileCitation == fileCitation &&
    other.startIndex == startIndex &&
    other.endIndex == endIndex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (type.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (fileCitation == null ? 0 : fileCitation!.hashCode) +
    (startIndex == null ? 0 : startIndex!.hashCode) +
    (endIndex == null ? 0 : endIndex!.hashCode);

  @override
  String toString() => 'MessageDeltaContentTextAnnotationsFileCitationObject[index=$index, type=$type, text=$text, fileCitation=$fileCitation, startIndex=$startIndex, endIndex=$endIndex]';

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
    return json;
  }

  /// Returns a new [MessageDeltaContentTextAnnotationsFileCitationObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentTextAnnotationsFileCitationObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentTextAnnotationsFileCitationObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentTextAnnotationsFileCitationObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentTextAnnotationsFileCitationObject(
        index: mapValueOfType<int>(json, r'index')!,
        type: MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum.fromJson(json[r'type'])!,
        text: mapValueOfType<String>(json, r'text'),
        fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(json[r'file_citation']),
        startIndex: mapValueOfType<int>(json, r'start_index'),
        endIndex: mapValueOfType<int>(json, r'end_index'),
      );
    }
    return null;
  }

  static List<MessageDeltaContentTextAnnotationsFileCitationObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextAnnotationsFileCitationObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextAnnotationsFileCitationObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentTextAnnotationsFileCitationObject> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentTextAnnotationsFileCitationObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentTextAnnotationsFileCitationObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentTextAnnotationsFileCitationObject-objects as value to a dart map
  static Map<String, List<MessageDeltaContentTextAnnotationsFileCitationObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentTextAnnotationsFileCitationObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentTextAnnotationsFileCitationObject.listFromJson(entry.value, growable: growable,);
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
class MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fileCitation = MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum._(r'file_citation');

  /// List of all possible values in this [enum][MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum].
  static const values = <MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum>[
    fileCitation,
  ];

  static MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum? fromJson(dynamic value) => MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum].
class MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer {
  factory MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer() => _instance ??= const MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer._();

  const MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer._();

  String encode(MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file_citation': return MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnum.fileCitation;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer] instance.
  static MessageDeltaContentTextAnnotationsFileCitationObjectTypeEnumTypeTransformer? _instance;
}


