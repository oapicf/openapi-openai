//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventInputAudioBufferCommitted {
  /// Returns a new [RealtimeServerEventInputAudioBufferCommitted] instance.
  RealtimeServerEventInputAudioBufferCommitted({
    required this.eventId,
    required this.type,
    required this.previousItemId,
    required this.itemId,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `input_audio_buffer.committed`.
  RealtimeServerEventInputAudioBufferCommittedTypeEnum type;

  /// The ID of the preceding item after which the new item will be inserted. 
  String previousItemId;

  /// The ID of the user message item that will be created.
  String itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventInputAudioBufferCommitted &&
    other.eventId == eventId &&
    other.type == type &&
    other.previousItemId == previousItemId &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (previousItemId.hashCode) +
    (itemId.hashCode);

  @override
  String toString() => 'RealtimeServerEventInputAudioBufferCommitted[eventId=$eventId, type=$type, previousItemId=$previousItemId, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'previous_item_id'] = this.previousItemId;
      json[r'item_id'] = this.itemId;
    return json;
  }

  /// Returns a new [RealtimeServerEventInputAudioBufferCommitted] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventInputAudioBufferCommitted? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventInputAudioBufferCommitted[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventInputAudioBufferCommitted[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventInputAudioBufferCommitted(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventInputAudioBufferCommittedTypeEnum.fromJson(json[r'type'])!,
        previousItemId: mapValueOfType<String>(json, r'previous_item_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventInputAudioBufferCommitted> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferCommitted>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferCommitted.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventInputAudioBufferCommitted> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventInputAudioBufferCommitted>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventInputAudioBufferCommitted.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventInputAudioBufferCommitted-objects as value to a dart map
  static Map<String, List<RealtimeServerEventInputAudioBufferCommitted>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventInputAudioBufferCommitted>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventInputAudioBufferCommitted.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'previous_item_id',
    'item_id',
  };
}

/// The event type, must be `input_audio_buffer.committed`.
class RealtimeServerEventInputAudioBufferCommittedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventInputAudioBufferCommittedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodCommitted = RealtimeServerEventInputAudioBufferCommittedTypeEnum._(r'input_audio_buffer.committed');

  /// List of all possible values in this [enum][RealtimeServerEventInputAudioBufferCommittedTypeEnum].
  static const values = <RealtimeServerEventInputAudioBufferCommittedTypeEnum>[
    inputAudioBufferPeriodCommitted,
  ];

  static RealtimeServerEventInputAudioBufferCommittedTypeEnum? fromJson(dynamic value) => RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventInputAudioBufferCommittedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventInputAudioBufferCommittedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventInputAudioBufferCommittedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventInputAudioBufferCommittedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventInputAudioBufferCommittedTypeEnum].
class RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer {
  factory RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer._();

  const RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventInputAudioBufferCommittedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventInputAudioBufferCommittedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventInputAudioBufferCommittedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.committed': return RealtimeServerEventInputAudioBufferCommittedTypeEnum.inputAudioBufferPeriodCommitted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventInputAudioBufferCommittedTypeEnumTypeTransformer? _instance;
}


