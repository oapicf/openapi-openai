//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventInputAudioBufferCleared {
  /// Returns a new [RealtimeServerEventInputAudioBufferCleared] instance.
  RealtimeServerEventInputAudioBufferCleared({
    required this.eventId,
    required this.type,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `input_audio_buffer.cleared`.
  RealtimeServerEventInputAudioBufferClearedTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventInputAudioBufferCleared &&
    other.eventId == eventId &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'RealtimeServerEventInputAudioBufferCleared[eventId=$eventId, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [RealtimeServerEventInputAudioBufferCleared] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventInputAudioBufferCleared? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventInputAudioBufferCleared[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventInputAudioBufferCleared[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventInputAudioBufferCleared(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventInputAudioBufferClearedTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventInputAudioBufferCleared> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferCleared>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferCleared.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventInputAudioBufferCleared> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventInputAudioBufferCleared>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventInputAudioBufferCleared.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventInputAudioBufferCleared-objects as value to a dart map
  static Map<String, List<RealtimeServerEventInputAudioBufferCleared>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventInputAudioBufferCleared>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventInputAudioBufferCleared.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
  };
}

/// The event type, must be `input_audio_buffer.cleared`.
class RealtimeServerEventInputAudioBufferClearedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventInputAudioBufferClearedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodCleared = RealtimeServerEventInputAudioBufferClearedTypeEnum._(r'input_audio_buffer.cleared');

  /// List of all possible values in this [enum][RealtimeServerEventInputAudioBufferClearedTypeEnum].
  static const values = <RealtimeServerEventInputAudioBufferClearedTypeEnum>[
    inputAudioBufferPeriodCleared,
  ];

  static RealtimeServerEventInputAudioBufferClearedTypeEnum? fromJson(dynamic value) => RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventInputAudioBufferClearedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferClearedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferClearedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventInputAudioBufferClearedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventInputAudioBufferClearedTypeEnum].
class RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer {
  factory RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer._();

  const RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventInputAudioBufferClearedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventInputAudioBufferClearedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventInputAudioBufferClearedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.cleared': return RealtimeServerEventInputAudioBufferClearedTypeEnum.inputAudioBufferPeriodCleared;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventInputAudioBufferClearedTypeEnumTypeTransformer? _instance;
}


