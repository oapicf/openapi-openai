//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseContentPartDonePart {
  /// Returns a new [RealtimeServerEventResponseContentPartDonePart] instance.
  RealtimeServerEventResponseContentPartDonePart({
    this.type,
    this.text,
    this.audio,
    this.transcript,
  });

  /// The content type (\"text\", \"audio\").
  RealtimeServerEventResponseContentPartDonePartTypeEnum? type;

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
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseContentPartDonePart &&
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
  String toString() => 'RealtimeServerEventResponseContentPartDonePart[type=$type, text=$text, audio=$audio, transcript=$transcript]';

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

  /// Returns a new [RealtimeServerEventResponseContentPartDonePart] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseContentPartDonePart? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseContentPartDonePart[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseContentPartDonePart[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseContentPartDonePart(
        type: RealtimeServerEventResponseContentPartDonePartTypeEnum.fromJson(json[r'type']),
        text: mapValueOfType<String>(json, r'text'),
        audio: mapValueOfType<String>(json, r'audio'),
        transcript: mapValueOfType<String>(json, r'transcript'),
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseContentPartDonePart> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartDonePart>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartDonePart.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseContentPartDonePart> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseContentPartDonePart>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseContentPartDonePart.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseContentPartDonePart-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseContentPartDonePart>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseContentPartDonePart>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseContentPartDonePart.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The content type (\"text\", \"audio\").
class RealtimeServerEventResponseContentPartDonePartTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseContentPartDonePartTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const audio = RealtimeServerEventResponseContentPartDonePartTypeEnum._(r'audio');
  static const text = RealtimeServerEventResponseContentPartDonePartTypeEnum._(r'text');

  /// List of all possible values in this [enum][RealtimeServerEventResponseContentPartDonePartTypeEnum].
  static const values = <RealtimeServerEventResponseContentPartDonePartTypeEnum>[
    audio,
    text,
  ];

  static RealtimeServerEventResponseContentPartDonePartTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseContentPartDonePartTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartDonePartTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartDonePartTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseContentPartDonePartTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseContentPartDonePartTypeEnum].
class RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseContentPartDonePartTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseContentPartDonePartTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseContentPartDonePartTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'audio': return RealtimeServerEventResponseContentPartDonePartTypeEnum.audio;
        case r'text': return RealtimeServerEventResponseContentPartDonePartTypeEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseContentPartDonePartTypeEnumTypeTransformer? _instance;
}


