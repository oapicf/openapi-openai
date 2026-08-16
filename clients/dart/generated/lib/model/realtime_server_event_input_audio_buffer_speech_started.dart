//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventInputAudioBufferSpeechStarted {
  /// Returns a new [RealtimeServerEventInputAudioBufferSpeechStarted] instance.
  RealtimeServerEventInputAudioBufferSpeechStarted({
    required this.eventId,
    required this.type,
    required this.audioStartMs,
    required this.itemId,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `input_audio_buffer.speech_started`.
  RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum type;

  /// Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
  int audioStartMs;

  /// The ID of the user message item that will be created when speech stops. 
  String itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventInputAudioBufferSpeechStarted &&
    other.eventId == eventId &&
    other.type == type &&
    other.audioStartMs == audioStartMs &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (audioStartMs.hashCode) +
    (itemId.hashCode);

  @override
  String toString() => 'RealtimeServerEventInputAudioBufferSpeechStarted[eventId=$eventId, type=$type, audioStartMs=$audioStartMs, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'audio_start_ms'] = this.audioStartMs;
      json[r'item_id'] = this.itemId;
    return json;
  }

  /// Returns a new [RealtimeServerEventInputAudioBufferSpeechStarted] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventInputAudioBufferSpeechStarted? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventInputAudioBufferSpeechStarted[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventInputAudioBufferSpeechStarted[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventInputAudioBufferSpeechStarted(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum.fromJson(json[r'type'])!,
        audioStartMs: mapValueOfType<int>(json, r'audio_start_ms')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventInputAudioBufferSpeechStarted> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferSpeechStarted>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferSpeechStarted.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventInputAudioBufferSpeechStarted> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventInputAudioBufferSpeechStarted>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventInputAudioBufferSpeechStarted.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventInputAudioBufferSpeechStarted-objects as value to a dart map
  static Map<String, List<RealtimeServerEventInputAudioBufferSpeechStarted>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventInputAudioBufferSpeechStarted>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventInputAudioBufferSpeechStarted.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'audio_start_ms',
    'item_id',
  };
}

/// The event type, must be `input_audio_buffer.speech_started`.
class RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodSpeechStarted = RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum._(r'input_audio_buffer.speech_started');

  /// List of all possible values in this [enum][RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum].
  static const values = <RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum>[
    inputAudioBufferPeriodSpeechStarted,
  ];

  static RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum? fromJson(dynamic value) => RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum].
class RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer {
  factory RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer._();

  const RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.speech_started': return RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum.inputAudioBufferPeriodSpeechStarted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventInputAudioBufferSpeechStartedTypeEnumTypeTransformer? _instance;
}


