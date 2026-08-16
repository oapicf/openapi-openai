//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeConversationItemContentInner {
  /// Returns a new [RealtimeConversationItemContentInner] instance.
  RealtimeConversationItemContentInner({
    this.type,
    this.text,
    this.id,
    this.audio,
    this.transcript,
  });

  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  RealtimeConversationItemContentInnerTypeEnum? type;

  /// The text content, used for `input_text` and `text` content types. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? text;

  /// ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Base64-encoded audio bytes, used for `input_audio` content type. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? audio;

  /// The transcript of the audio, used for `input_audio` content type. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? transcript;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeConversationItemContentInner &&
    other.type == type &&
    other.text == text &&
    other.id == id &&
    other.audio == audio &&
    other.transcript == transcript;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (audio == null ? 0 : audio!.hashCode) +
    (transcript == null ? 0 : transcript!.hashCode);

  @override
  String toString() => 'RealtimeConversationItemContentInner[type=$type, text=$text, id=$id, audio=$audio, transcript=$transcript]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.text != null) {
      json[r'text'] = this.text;
    } else {
      json[r'text'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.audio != null) {
      json[r'audio'] = this.audio;
    } else {
      json[r'audio'] = null;
    }
    if (this.transcript != null) {
      json[r'transcript'] = this.transcript;
    } else {
      json[r'transcript'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeConversationItemContentInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeConversationItemContentInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeConversationItemContentInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeConversationItemContentInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeConversationItemContentInner(
        type: RealtimeConversationItemContentInnerTypeEnum.fromJson(json[r'type']),
        text: mapValueOfType<String>(json, r'text'),
        id: mapValueOfType<String>(json, r'id'),
        audio: mapValueOfType<String>(json, r'audio'),
        transcript: mapValueOfType<String>(json, r'transcript'),
      );
    }
    return null;
  }

  static List<RealtimeConversationItemContentInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeConversationItemContentInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeConversationItemContentInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeConversationItemContentInner> mapFromJson(dynamic json) {
    final map = <String, RealtimeConversationItemContentInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeConversationItemContentInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeConversationItemContentInner-objects as value to a dart map
  static Map<String, List<RealtimeConversationItemContentInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeConversationItemContentInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeConversationItemContentInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
class RealtimeConversationItemContentInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeConversationItemContentInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudio = RealtimeConversationItemContentInnerTypeEnum._(r'input_audio');
  static const inputText = RealtimeConversationItemContentInnerTypeEnum._(r'input_text');
  static const itemReference = RealtimeConversationItemContentInnerTypeEnum._(r'item_reference');
  static const text = RealtimeConversationItemContentInnerTypeEnum._(r'text');

  /// List of all possible values in this [enum][RealtimeConversationItemContentInnerTypeEnum].
  static const values = <RealtimeConversationItemContentInnerTypeEnum>[
    inputAudio,
    inputText,
    itemReference,
    text,
  ];

  static RealtimeConversationItemContentInnerTypeEnum? fromJson(dynamic value) => RealtimeConversationItemContentInnerTypeEnumTypeTransformer().decode(value);

  static List<RealtimeConversationItemContentInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeConversationItemContentInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeConversationItemContentInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeConversationItemContentInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeConversationItemContentInnerTypeEnum].
class RealtimeConversationItemContentInnerTypeEnumTypeTransformer {
  factory RealtimeConversationItemContentInnerTypeEnumTypeTransformer() => _instance ??= const RealtimeConversationItemContentInnerTypeEnumTypeTransformer._();

  const RealtimeConversationItemContentInnerTypeEnumTypeTransformer._();

  String encode(RealtimeConversationItemContentInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeConversationItemContentInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeConversationItemContentInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio': return RealtimeConversationItemContentInnerTypeEnum.inputAudio;
        case r'input_text': return RealtimeConversationItemContentInnerTypeEnum.inputText;
        case r'item_reference': return RealtimeConversationItemContentInnerTypeEnum.itemReference;
        case r'text': return RealtimeConversationItemContentInnerTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeConversationItemContentInnerTypeEnumTypeTransformer] instance.
  static RealtimeConversationItemContentInnerTypeEnumTypeTransformer? _instance;
}


