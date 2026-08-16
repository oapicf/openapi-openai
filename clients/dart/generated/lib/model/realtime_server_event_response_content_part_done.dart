//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseContentPartDone {
  /// Returns a new [RealtimeServerEventResponseContentPartDone] instance.
  RealtimeServerEventResponseContentPartDone({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.itemId,
    required this.outputIndex,
    required this.contentIndex,
    required this.part_,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.content_part.done`.
  RealtimeServerEventResponseContentPartDoneTypeEnum type;

  /// The ID of the response.
  String responseId;

  /// The ID of the item.
  String itemId;

  /// The index of the output item in the response.
  int outputIndex;

  /// The index of the content part in the item's content array.
  int contentIndex;

  RealtimeServerEventResponseContentPartDonePart part_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseContentPartDone &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.itemId == itemId &&
    other.outputIndex == outputIndex &&
    other.contentIndex == contentIndex &&
    other.part_ == part_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (itemId.hashCode) +
    (outputIndex.hashCode) +
    (contentIndex.hashCode) +
    (part_.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseContentPartDone[eventId=$eventId, type=$type, responseId=$responseId, itemId=$itemId, outputIndex=$outputIndex, contentIndex=$contentIndex, part_=$part_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'item_id'] = this.itemId;
      json[r'output_index'] = this.outputIndex;
      json[r'content_index'] = this.contentIndex;
      json[r'part'] = this.part_;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseContentPartDone] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseContentPartDone? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseContentPartDone[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseContentPartDone[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseContentPartDone(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseContentPartDoneTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        itemId: mapValueOfType<String>(json, r'item_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        contentIndex: mapValueOfType<int>(json, r'content_index')!,
        part_: RealtimeServerEventResponseContentPartDonePart.fromJson(json[r'part'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseContentPartDone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartDone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartDone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseContentPartDone> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseContentPartDone>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseContentPartDone.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseContentPartDone-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseContentPartDone>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseContentPartDone>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseContentPartDone.listFromJson(entry.value, growable: growable,);
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
    'part',
  };
}

/// The event type, must be `response.content_part.done`.
class RealtimeServerEventResponseContentPartDoneTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseContentPartDoneTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodContentPartPeriodDone = RealtimeServerEventResponseContentPartDoneTypeEnum._(r'response.content_part.done');

  /// List of all possible values in this [enum][RealtimeServerEventResponseContentPartDoneTypeEnum].
  static const values = <RealtimeServerEventResponseContentPartDoneTypeEnum>[
    responsePeriodContentPartPeriodDone,
  ];

  static RealtimeServerEventResponseContentPartDoneTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseContentPartDoneTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseContentPartDoneTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseContentPartDoneTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseContentPartDoneTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseContentPartDoneTypeEnum].
class RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseContentPartDoneTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseContentPartDoneTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseContentPartDoneTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.content_part.done': return RealtimeServerEventResponseContentPartDoneTypeEnum.responsePeriodContentPartPeriodDone;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseContentPartDoneTypeEnumTypeTransformer? _instance;
}


