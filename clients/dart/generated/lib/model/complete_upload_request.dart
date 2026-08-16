//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CompleteUploadRequest {
  /// Returns a new [CompleteUploadRequest] instance.
  CompleteUploadRequest({
    this.partIds = const [],
    this.md5,
  });

  /// The ordered list of Part IDs. 
  List<String> partIds;

  /// The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? md5;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CompleteUploadRequest &&
    _deepEquality.equals(other.partIds, partIds) &&
    other.md5 == md5;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (partIds.hashCode) +
    (md5 == null ? 0 : md5!.hashCode);

  @override
  String toString() => 'CompleteUploadRequest[partIds=$partIds, md5=$md5]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'part_ids'] = this.partIds;
    if (this.md5 != null) {
      json[r'md5'] = this.md5;
    } else {
      json[r'md5'] = null;
    }
    return json;
  }

  /// Returns a new [CompleteUploadRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CompleteUploadRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CompleteUploadRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CompleteUploadRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CompleteUploadRequest(
        partIds: json[r'part_ids'] is Iterable
            ? (json[r'part_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        md5: mapValueOfType<String>(json, r'md5'),
      );
    }
    return null;
  }

  static List<CompleteUploadRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CompleteUploadRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CompleteUploadRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CompleteUploadRequest> mapFromJson(dynamic json) {
    final map = <String, CompleteUploadRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CompleteUploadRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CompleteUploadRequest-objects as value to a dart map
  static Map<String, List<CompleteUploadRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CompleteUploadRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CompleteUploadRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'part_ids',
  };
}

