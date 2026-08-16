//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventInputAudioBufferAppend {
  /// Returns a new [RealtimeClientEventInputAudioBufferAppend] instance.
  RealtimeClientEventInputAudioBufferAppend({
    this.eventId,
    required this.type,
    required this.audio,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `input_audio_buffer.append`.
  RealtimeClientEventInputAudioBufferAppendTypeEnum type;

  /// Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
  String audio;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventInputAudioBufferAppend &&
    other.eventId == eventId &&
    other.type == type &&
    other.audio == audio;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode) +
    (audio.hashCode);

  @override
  String toString() => 'RealtimeClientEventInputAudioBufferAppend[eventId=$eventId, type=$type, audio=$audio]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
      json[r'audio'] = this.audio;
    return json;
  }

  /// Returns a new [RealtimeClientEventInputAudioBufferAppend] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventInputAudioBufferAppend? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeClientEventInputAudioBufferAppend[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeClientEventInputAudioBufferAppend[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeClientEventInputAudioBufferAppend(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventInputAudioBufferAppendTypeEnum.fromJson(json[r'type'])!,
        audio: mapValueOfType<String>(json, r'audio')!,
      );
    }
    return null;
  }

  static List<RealtimeClientEventInputAudioBufferAppend> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventInputAudioBufferAppend>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventInputAudioBufferAppend.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventInputAudioBufferAppend> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventInputAudioBufferAppend>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventInputAudioBufferAppend.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventInputAudioBufferAppend-objects as value to a dart map
  static Map<String, List<RealtimeClientEventInputAudioBufferAppend>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventInputAudioBufferAppend>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventInputAudioBufferAppend.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'audio',
  };
}

/// The event type, must be `input_audio_buffer.append`.
class RealtimeClientEventInputAudioBufferAppendTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeClientEventInputAudioBufferAppendTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodAppend = RealtimeClientEventInputAudioBufferAppendTypeEnum._(r'input_audio_buffer.append');

  /// List of all possible values in this [enum][RealtimeClientEventInputAudioBufferAppendTypeEnum].
  static const values = <RealtimeClientEventInputAudioBufferAppendTypeEnum>[
    inputAudioBufferPeriodAppend,
  ];

  static RealtimeClientEventInputAudioBufferAppendTypeEnum? fromJson(dynamic value) => RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer().decode(value);

  static List<RealtimeClientEventInputAudioBufferAppendTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventInputAudioBufferAppendTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventInputAudioBufferAppendTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventInputAudioBufferAppendTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventInputAudioBufferAppendTypeEnum].
class RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer {
  factory RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer._();

  const RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventInputAudioBufferAppendTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeClientEventInputAudioBufferAppendTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventInputAudioBufferAppendTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.append': return RealtimeClientEventInputAudioBufferAppendTypeEnum.inputAudioBufferPeriodAppend;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer] instance.
  static RealtimeClientEventInputAudioBufferAppendTypeEnumTypeTransformer? _instance;
}


