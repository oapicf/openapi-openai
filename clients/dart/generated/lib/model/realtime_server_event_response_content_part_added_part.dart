//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseContentPartAddedPart {
  /// Returns a new [RealtimeServerEventResponseContentPartAddedPart] instance.
  RealtimeServerEventResponseContentPartAddedPart({
    this.type,
    this.text,
    this.audio,
    this.transcript,
  });

  /// The content type (\"text\", \"audio\").
  RealtimeServerEventResponseContentPartAddedPartTypeEnum? type;

  /// The text content (if type is \"text\").
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? text;

  /// Base64-encoded audio data (if type is \"audio\").
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? audio;

  /// The transcript of the audio (if type is \"audio\").
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? transcript;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseContentPartAddedPart &&
    other.type == type &&
    other.text == text &&
    other.audio == audio &&
    other.transcript == transcript;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (text == null ? 0 : text!.hashCode) +
    (audio == null ? 0 : audio!.hashCode) +
    (transcript == null ? 0 : transcript!.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseContentPartAddedPart[type=$type, text=$text, audio=$audio, transcript=$transcript]';

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

  /// Returns a new [RealtimeServerEventResponseContentPartAddedPart] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseContentPartAddedPart? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseContentPartAddedPart[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseContentPartAddedPart[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseContentPartAddedPart(
        type: RealtimeServerEventResponseContentPartAddedPartTypeEnum.fromJson(json[r'type']),
        text: mapValueOfType<String>(json, r'text'),
        audio: mapValueOfType<String>(json, r'audio'),
        transcript: mapValueOfType<String>(json, r'transcript'),
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseContentPartAddedPart> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartAddedPart>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartAddedPart.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseContentPartAddedPart> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseContentPartAddedPart>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseContentPartAddedPart.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseContentPartAddedPart-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseContentPartAddedPart>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseContentPartAddedPart>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseContentPartAddedPart.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The content type (\"text\", \"audio\").
class RealtimeServerEventResponseContentPartAddedPartTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseContentPartAddedPartTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const audio = RealtimeServerEventResponseContentPartAddedPartTypeEnum._(r'audio');
  static const text = RealtimeServerEventResponseContentPartAddedPartTypeEnum._(r'text');

  /// List of all possible values in this [enum][RealtimeServerEventResponseContentPartAddedPartTypeEnum].
  static const values = <RealtimeServerEventResponseContentPartAddedPartTypeEnum>[
    audio,
    text,
  ];

  static RealtimeServerEventResponseContentPartAddedPartTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseContentPartAddedPartTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartAddedPartTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartAddedPartTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseContentPartAddedPartTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseContentPartAddedPartTypeEnum].
class RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseContentPartAddedPartTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseContentPartAddedPartTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseContentPartAddedPartTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'audio': return RealtimeServerEventResponseContentPartAddedPartTypeEnum.audio;
        case r'text': return RealtimeServerEventResponseContentPartAddedPartTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseContentPartAddedPartTypeEnumTypeTransformer? _instance;
}


