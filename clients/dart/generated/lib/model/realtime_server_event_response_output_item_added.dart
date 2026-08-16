//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventResponseOutputItemAdded {
  /// Returns a new [RealtimeServerEventResponseOutputItemAdded] instance.
  RealtimeServerEventResponseOutputItemAdded({
    required this.eventId,
    required this.type,
    required this.responseId,
    required this.outputIndex,
    required this.item,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `response.output_item.added`.
  RealtimeServerEventResponseOutputItemAddedTypeEnum type;

  /// The ID of the Response to which the item belongs.
  String responseId;

  /// The index of the output item in the Response.
  int outputIndex;

  RealtimeConversationItem item;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventResponseOutputItemAdded &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId &&
    other.outputIndex == outputIndex &&
    other.item == item;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (responseId.hashCode) +
    (outputIndex.hashCode) +
    (item.hashCode);

  @override
  String toString() => 'RealtimeServerEventResponseOutputItemAdded[eventId=$eventId, type=$type, responseId=$responseId, outputIndex=$outputIndex, item=$item]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'response_id'] = this.responseId;
      json[r'output_index'] = this.outputIndex;
      json[r'item'] = this.item;
    return json;
  }

  /// Returns a new [RealtimeServerEventResponseOutputItemAdded] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventResponseOutputItemAdded? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventResponseOutputItemAdded[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventResponseOutputItemAdded[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventResponseOutputItemAdded(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventResponseOutputItemAddedTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id')!,
        outputIndex: mapValueOfType<int>(json, r'output_index')!,
        item: RealtimeConversationItem.fromJson(json[r'item'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventResponseOutputItemAdded> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseOutputItemAdded>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseOutputItemAdded.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventResponseOutputItemAdded> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventResponseOutputItemAdded>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventResponseOutputItemAdded.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventResponseOutputItemAdded-objects as value to a dart map
  static Map<String, List<RealtimeServerEventResponseOutputItemAdded>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventResponseOutputItemAdded>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventResponseOutputItemAdded.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'response_id',
    'output_index',
    'item',
  };
}

/// The event type, must be `response.output_item.added`.
class RealtimeServerEventResponseOutputItemAddedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventResponseOutputItemAddedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodOutputItemPeriodAdded = RealtimeServerEventResponseOutputItemAddedTypeEnum._(r'response.output_item.added');

  /// List of all possible values in this [enum][RealtimeServerEventResponseOutputItemAddedTypeEnum].
  static const values = <RealtimeServerEventResponseOutputItemAddedTypeEnum>[
    responsePeriodOutputItemPeriodAdded,
  ];

  static RealtimeServerEventResponseOutputItemAddedTypeEnum? fromJson(dynamic value) => RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventResponseOutputItemAddedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventResponseOutputItemAddedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventResponseOutputItemAddedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventResponseOutputItemAddedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventResponseOutputItemAddedTypeEnum].
class RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer {
  factory RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer._();

  const RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventResponseOutputItemAddedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventResponseOutputItemAddedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventResponseOutputItemAddedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.output_item.added': return RealtimeServerEventResponseOutputItemAddedTypeEnum.responsePeriodOutputItemPeriodAdded;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventResponseOutputItemAddedTypeEnumTypeTransformer? _instance;
}


