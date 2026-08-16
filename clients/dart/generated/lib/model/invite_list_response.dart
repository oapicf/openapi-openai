//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteListResponse {
  /// Returns a new [InviteListResponse] instance.
  InviteListResponse({
    required this.object,
    this.data = const [],
    this.firstId,
    this.lastId,
    this.hasMore,
  });

  /// The object type, which is always `list`
  InviteListResponseObjectEnum object;

  List<Invite> data;

  /// The first `invite_id` in the retrieved `list`
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? firstId;

  /// The last `invite_id` in the retrieved `list`
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? lastId;

  /// The `has_more` property is used for pagination to indicate there are additional results.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasMore;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteListResponse &&
    other.object == object &&
    _deepEquality.equals(other.data, data) &&
    other.firstId == firstId &&
    other.lastId == lastId &&
    other.hasMore == hasMore;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (data.hashCode) +
    (firstId == null ? 0 : firstId!.hashCode) +
    (lastId == null ? 0 : lastId!.hashCode) +
    (hasMore == null ? 0 : hasMore!.hashCode);

  @override
  String toString() => 'InviteListResponse[object=$object, data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
    if (this.firstId != null) {
      json[r'first_id'] = this.firstId;
    } else {
      json[r'first_id'] = null;
    }
    if (this.lastId != null) {
      json[r'last_id'] = this.lastId;
    } else {
      json[r'last_id'] = null;
    }
    if (this.hasMore != null) {
      json[r'has_more'] = this.hasMore;
    } else {
      json[r'has_more'] = null;
    }
    return json;
  }

  /// Returns a new [InviteListResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteListResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteListResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteListResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteListResponse(
        object: InviteListResponseObjectEnum.fromJson(json[r'object'])!,
        data: Invite.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id'),
        lastId: mapValueOfType<String>(json, r'last_id'),
        hasMore: mapValueOfType<bool>(json, r'has_more'),
      );
    }
    return null;
  }

  static List<InviteListResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteListResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteListResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteListResponse> mapFromJson(dynamic json) {
    final map = <String, InviteListResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteListResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteListResponse-objects as value to a dart map
  static Map<String, List<InviteListResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteListResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteListResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'data',
  };
}

/// The object type, which is always `list`
class InviteListResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const InviteListResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = InviteListResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][InviteListResponseObjectEnum].
  static const values = <InviteListResponseObjectEnum>[
    list,
  ];

  static InviteListResponseObjectEnum? fromJson(dynamic value) => InviteListResponseObjectEnumTypeTransformer().decode(value);

  static List<InviteListResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteListResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteListResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InviteListResponseObjectEnum] to String,
/// and [decode] dynamic data back to [InviteListResponseObjectEnum].
class InviteListResponseObjectEnumTypeTransformer {
  factory InviteListResponseObjectEnumTypeTransformer() => _instance ??= const InviteListResponseObjectEnumTypeTransformer._();

  const InviteListResponseObjectEnumTypeTransformer._();

  String encode(InviteListResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InviteListResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InviteListResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return InviteListResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [InviteListResponseObjectEnumTypeTransformer] instance.
  static InviteListResponseObjectEnumTypeTransformer? _instance;
}


