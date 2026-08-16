//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseAudioDone {
  /// Returns a new [RealtimeServerEventResponseAudioDone] instance.
  RealtimeServerEventResponseAudioDone({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.contentIndex,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.audio.done`.
  RealtimeServerEventResponseAudioDoneTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The index of the content part in the item's content array.
  int contentIndex;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseAudioDone &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.contentIndex == contentIndex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (contentIndex.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseAudioDone[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, contentIndex=$contentIndex]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'content_index'] = this.contentIndex;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseAudioDone] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseAudioDone? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseAudioDone[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseAudioDone[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseAudioDone(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseAudioDoneTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseAudioDone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioDone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioDone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseAudioDone> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseAudioDone>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseAudioDone.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseAudioDone-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseAudioDone>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseAudioDone>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseAudioDone.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'response_id',
    'item_id',
    'output_index',
    'content_index',
  };
}

/// The event type, must be `response.audio.done`.
class RealtimeServerEventResponseAudioDoneTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseAudioDoneTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodAudioPeriodDone = RealtimeServerEventResponseAudioDoneTypeEnum._(r'response.audio.done');

  /// List of all possible values in this [enum][RealtimeServerEventResponseAudioDoneTypeEnum].
  static const values = <RealtimeServerEventResponseAudioDoneTypeEnum>[
    responsePeriodAudioPeriodDone,
  ];

  static RealtimeServerEventResponseAudioDoneTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseAudioDoneTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseAudioDoneTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseAudioDoneTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseAudioDoneTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseAudioDoneTypeEnum].
class RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseAudioDoneTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseAudioDoneTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseAudioDoneTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.audio.done': return RealtimeServerEventResponseAudioDoneTypeEnum.responsePeriodAudioPeriodDone;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseAudioDoneTypeEnumTypeTransformer? _instance;
}


