//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventConversationCreated {
  /// Returns a new [RealtimeServerEventConversationCreated] instance.
  RealtimeServerEventConversationCreated({
    required this.eventId,
    required this.type,
    required this.conversation,
  });

  /// The unique ID of the server event.
  String eventId;

  /// The event type, must be `conversation.created`.
  RealtimeServerEventConversationCreatedTypeEnum type;

  RealtimeServerEventConversationCreatedConversation conversation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventConversationCreated &&
    other.eventId == eventId &&
    other.type == type &&
    other.conversation == conversation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId.hashCode) +
    (type.hashCode) +
    (conversation.hashCode);

  @override
  String toString() => 'RealtimeServerEventConversationCreated[eventId=$eventId, type=$type, conversation=$conversation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event_id'] = this.eventId;
      json[r'type'] = this.type;
      json[r'conversation'] = this.conversation;
    return json;
  }

  /// Returns a new [RealtimeServerEventConversationCreated] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventConversationCreated? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventConversationCreated[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventConversationCreated[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventConversationCreated(
        eventId: mapValueOfType<String>(json, r'event_id')!,
        type: RealtimeServerEventConversationCreatedTypeEnum.fromJson(json[r'type'])!,
        conversation: RealtimeServerEventConversationCreatedConversation.fromJson(json[r'conversation'])!,
      );
    }
    return null;
  }

  static List<RealtimeServerEventConversationCreated> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationCreated>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationCreated.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventConversationCreated> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventConversationCreated>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventConversationCreated.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventConversationCreated-objects as value to a dart map
  static Map<String, List<RealtimeServerEventConversationCreated>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventConversationCreated>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventConversationCreated.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event_id',
    'type',
    'conversation',
  };
}

/// The event type, must be `conversation.created`.
class RealtimeServerEventConversationCreatedTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeServerEventConversationCreatedTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const conversationPeriodCreated = RealtimeServerEventConversationCreatedTypeEnum._(r'conversation.created');

  /// List of all possible values in this [enum][RealtimeServerEventConversationCreatedTypeEnum].
  static const values = <RealtimeServerEventConversationCreatedTypeEnum>[
    conversationPeriodCreated,
  ];

  static RealtimeServerEventConversationCreatedTypeEnum? fromJson(dynamic value) => RealtimeServerEventConversationCreatedTypeEnumTypeTransformer().decode(value);

  static List<RealtimeServerEventConversationCreatedTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventConversationCreatedTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventConversationCreatedTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeServerEventConversationCreatedTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeServerEventConversationCreatedTypeEnum].
class RealtimeServerEventConversationCreatedTypeEnumTypeTransformer {
  factory RealtimeServerEventConversationCreatedTypeEnumTypeTransformer() => _instance ??= const RealtimeServerEventConversationCreatedTypeEnumTypeTransformer._();

  const RealtimeServerEventConversationCreatedTypeEnumTypeTransformer._();

  String encode(RealtimeServerEventConversationCreatedTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeServerEventConversationCreatedTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeServerEventConversationCreatedTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'conversation.created': return RealtimeServerEventConversationCreatedTypeEnum.conversationPeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeServerEventConversationCreatedTypeEnumTypeTransformer] instance.
  static RealtimeServerEventConversationCreatedTypeEnumTypeTransformer? _instance;
}


